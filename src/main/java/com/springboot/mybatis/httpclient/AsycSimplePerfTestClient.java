package com.springboot.mybatis.httpclient;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/12/2  10:13
 */
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.impl.nio.conn.PoolingNHttpClientConnectionManager;
import org.apache.http.impl.nio.reactor.DefaultConnectingIOReactor;
import org.apache.http.nio.reactor.ConnectingIOReactor;
import org.apache.http.util.EntityUtils;
import reactor.core.Exceptions;

public class AsycSimplePerfTestClient implements Runnable {

    private  int requestRunTime = 0;
    private static CloseableHttpAsyncClient httpclient = null;

    public AsycSimplePerfTestClient(int runTime) {
        // TODO Auto-generated constructor stub
        requestRunTime = runTime;
    }

    static{
        try {
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(30000)
                    .setConnectTimeout(30000)
                    .build();

            ConnectingIOReactor ioReactor = new DefaultConnectingIOReactor();
            PoolingNHttpClientConnectionManager connManager = new PoolingNHttpClientConnectionManager(ioReactor);
            connManager.setMaxTotal(1500);
            connManager.setDefaultMaxPerRoute(1500);

            httpclient = HttpAsyncClients.custom().setConnectionManager(connManager)
                    .setDefaultRequestConfig(requestConfig)
                    .build();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void doGetRequest(int runTime) throws Exception {

        try {
            httpclient.start();
            final HttpGet request = new HttpGet("http://localhost:8080/access.action");
            final CountDownLatch latch = new CountDownLatch(runTime);
            for(int i = 0; i < runTime; i++){
                httpclient.execute(request, new FutureCallback<HttpResponse>() {
                    @Override
                    public void completed(final HttpResponse response) {
                        //latch.countDown();
                        HttpEntity entity = response.getEntity();
                        try{
                            System.out.println("当前线程为:"+ Thread.currentThread().getName() + ",请求完成!"
                                    + "获取的数据为:" + EntityUtils.toString(entity,"utf-8"));
                        }catch(Exception e){
                            System.out.println("出现异常!");
                            e.printStackTrace();
                        }
                        latch.countDown();
//		                System.out.println(request.getRequestLine() + "->" + response.getStatusLine());
                    }
                    @Override
                    public void failed(final Exception ex) {

                        System.out.println("请求失败!!!!!!");
                        ex.printStackTrace();
                        latch.countDown();
                    }
                    @Override
                    public void cancelled() {
                        System.out.println(request.getRequestLine() + " cancelled");
                        latch.countDown();
                    }

                });
            }
            latch.await();
            System.out.println("aShutting down");
        } finally {
            System.out.println("http client关闭！");
            httpclient.close();
        }
        System.out.println("Done");
    }

    public void run() {
        try {
            doGetRequest(requestRunTime);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        int threadNum = 4;
        int runTime = 300;
        for(int i = 0; i < threadNum; i++ ){
            new Thread(new AsycSimplePerfTestClient(runTime)).start();
        }

    }
}
