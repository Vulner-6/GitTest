package com.httpandhttps;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FirstHttpRequest implements Runnable {
    public void run(){
        try{
            //可以修改要访问的目的地址
            String strUrl="http://www.baidu.com";
            URL url=new URL(strUrl);
            //得到连接对象
            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
            //设置请求方式
            httpURLConnection.setRequestMethod("GET");
            //建立连接
            httpURLConnection.connect();
            //得到响应码
            int responseCode=httpURLConnection.getResponseCode();
            if(responseCode==HttpURLConnection.HTTP_OK){
                //得到响应流
                InputStream inputStream=httpURLConnection.getInputStream();
                //将响应流转换成字符串，用我自己封装的StringStream类
                String strResult=StringStream.streamToString(inputStream);
                //打印输出一下
                System.out.println("响应码："+responseCode+"\n"+"内容字符串：\n"+strResult);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
