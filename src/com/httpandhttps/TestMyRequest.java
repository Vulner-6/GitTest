package com.httpandhttps;

public class TestMyRequest {
    public static void main(String[] args){
        String url="htts://www.baidu.com";
        String method="POST";
        String[] header={"aa","bb"};
        String body="555";
        MyRequest myRequest=new MyRequest();
        myRequest.sendRequest(url,method,header,body);
    }
}
