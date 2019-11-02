package com.httpandhttps;

public class TestHttp {
    public static void main(String[] args) throws Exception{
        //测试http连接
        FirstHttpRequest firstHttpRequest=new FirstHttpRequest();
        Thread thread=new Thread(firstHttpRequest,"第一个http请求");
        thread.start();

        //设置http代理
        System.setProperty("http.proxySet", "true");
        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "4443");
        //设置https代理
        System.setProperty("https.proxySet","true");
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyPort", "4443");

        //测试https连接
        String url="https://www.baidu.com/";
        String outputStr="";
        System.out.println(FirstHttpsRequest.httpsRequest("GET",url,outputStr));
    }
}
