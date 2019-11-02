package com.httpandhttps;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * HTTP GET请求
 * 1.可以设置URL地址
 * 2.可以设置包头
 * 3.返回UTF-8格式的response字符串，包括状态码，包头
 */
public class HttpGet implements Runnable{
    public void run(){
        String url="http://www.baidu.com";
        String response=buildConnect(url);
        System.out.println(response);

    }

    //建立请求，获取返回包内容
    public static String buildConnect(String url){
        try{
            //设置要访问的URL地址，由于是GET请求，所以参数也在url中
            URL targetUrl=setUrl(url);
            //获得要远程连接的对象的实例
            HttpURLConnection httpURLConnection=(HttpURLConnection) targetUrl.openConnection();
            //设置请求方式
            httpURLConnection.setRequestMethod("GET");
            //设置包头，这里用于测试
            setHeader(httpURLConnection,"testHeader","66666");
            //建立连接
            httpURLConnection.connect();

            //获取响应码
            int responseCode=httpURLConnection.getResponseCode();
            //获取响应流
            InputStream inputStream=httpURLConnection.getInputStream();
            //将响应流转化成字符串
            String strResponse=StringStream.streamToString(inputStream);
            return strResponse;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //设置URL,返回URL类型
    public static URL setUrl(String url) throws Exception{
        URL targetUrl=new URL(url);
        return targetUrl;
    }
    //设置包头
    public static void setHeader(HttpURLConnection httpURLConnection,String header,String value){
        httpURLConnection.setRequestProperty(header,value);
    }


}
