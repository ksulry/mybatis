package com.springboot.mybatis.httpclient;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;


public class AsycPerfGetClient
{
    public static void main( String[] args ) throws InterruptedException {
        CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
        try {
            // Start the client
            httpclient.start();

            // One most likely would want to use a callback for operation result
            final CountDownLatch latch = new CountDownLatch(1);
            final HttpGet request = new HttpGet("http://www.kaola.com/");
            httpclient.execute(request, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(final HttpResponse response2) {
                    latch.countDown();
                    System.out.println(request.getRequestLine() + "->" + response2.getStatusLine());
                }
                @Override
                public void failed(final Exception ex) {
                    latch.countDown();
                    System.out.println(request.getRequestLine() + "->" + ex);
                }
                @Override
                public void cancelled() {
                    latch.countDown();
                    System.out.println(request.getRequestLine() + " cancelled");
                }

            });
            latch.await();

        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
