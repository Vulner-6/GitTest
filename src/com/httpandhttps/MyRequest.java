package com.httpandhttps;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : JavaPyC
 * String sendRequest(String method,String url,String[] header,String body)
 */
public class MyRequest {
    private String fullUrl=null;
    private String method=null;
    private Map<String,String> mapHeader=new HashMap<String,String>();
    //如果要使用默认值，就传入null
    public String sendRequest(String fullUrl,String method,String[][] header,String body){
        //分析请求的协议、方法
        this.fullUrl=fullUrl.trim();
        this.method=method.trim().toUpperCase();
        //判断method的值是不是POST或GET
        if(!this.method.equals("POST")||!this.method.equals("GET")){
            System.out.println("请求的方式不是POST或GET,请检查参数");
            System.exit(0);
        }
        String tempStr=this.fullUrl.substring(0,5);
        String responseResult=null;
        switch (tempStr.toLowerCase()){
            case "https":
                //运行https协议
                break;
            case "http:":
                //运行http协议
                break;
            default:
                System.out.println("传入的URL地址，协议部分有错");
                System.exit(0);
        }



        return responseResult;
    }

    /**
     * HTTP协议的GET请求或者POST请求（未完成）
     */
    private String httpRequest(String fullUrl,String method,String[] header,String body){
        //判断请求方式是GET还是POST
        switch (method){
            case "GET":
                //发送GET请求
                break;
            case "POST":
                //发送POST请求
                break;
        }
        return null;
    }

    /**
     * HTTPS协议的GET请求或者POST请求 (未完成)
     */
    private String httpsRequest(String method,String[] header,String body){
        return null;
    }



}


