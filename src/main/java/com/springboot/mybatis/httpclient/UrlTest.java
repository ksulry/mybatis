package com.springboot.mybatis.httpclient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/12/2  14:00
 */
public class UrlTest {
    public final static String urlGet()throws Exception{
        String result = "";
        URL url = new URL("http://localhost:8080/access.action");    // 把字符串转换为URL请求地址
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();// 打开连接
        conn.setRequestMethod("GET");//get 请求设置
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
        conn.setUseCaches(false);
        conn.connect();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str = "";
        while ((str = br.readLine()) != null) {
            result += str;
        }
        is.close();
        conn.disconnect();
        return result;
    }
    public static void main(String[] args)  {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1200; i++) {
            try{
                String result = urlGet();
                System.out.println("接收到的数据为:" + result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("运行时长:" + (end - start)/1000 + "s");
    }
}
