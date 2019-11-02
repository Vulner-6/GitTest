package com.readtxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * 该类主要目的是，通过不同的方法，读取不同文件中的指定内容
 */
public class ReadContext {
    private static String method=null;  //请求方式get还是post
    private static String fullUrl=null;    //请求的完整url
    private static String dirctory=null;   //请求的目录
    private static String host=null;      //请求的主机
    private static String headerKey=null;  //请求的包头字段
    private static String headerValue=null;   //包头对应的值
    private static LinkedHashMap<String,String> headerLinkedHashMap=new LinkedHashMap<String,String>();
    private static String body=null;   //包体

    /**
     * 读取TXT文档中的Request请求包（Burpsuite粘贴的），获取对应的字段以及值，并赋值给静态成员。
     * @param filePath
     * @throws Exception
     */
    public static void readTxtFileContext(String filePath) throws Exception{
        String encoding="GBK";
        //获取文件句柄
        File file=new File(filePath);
        //判断该文件是否是标准文件，以及是否存在
        if(file.isFile()&&file.exists()){
            //以GBK编码的方式将字节流转换成字符流,这样txt中的中文才不会乱码，utf8居然乱码了。
            InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(file), encoding);
            //以缓冲区方式读取字符流
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            //依次读取一行
            String str="";
            String temp="";
            int num=0;
            while ((temp=bufferedReader.readLine())!=null){
                //根据-1的次数，来判断header部分和body部分
                if(temp.indexOf(":")==-1){
                    num++;
                    //num为1，表示在第一行，可以提取请求方式和目录
                    if(num==1){
                        //提取请求方式
                        if(temp.indexOf("POST")!=-1){
                            method="POST";
                        }
                        if(temp.indexOf("GET")!=-1){
                            method="GET";
                        }
                        //提取目录部分
                        int start,stop;
                        start=temp.indexOf(" ");
                        stop=temp.indexOf(" HTTP");
                        dirctory=temp.substring(start,stop).trim();   //成功提取目录部分
                    }

                    //num为2，则表示到了body上面的那一行空白行
                    if(num==2){
                        //既然到了空白行，那就直接再次读取下一行，作为包体
                        body=bufferedReader.readLine();
                        break;
                    }
                }
                //如果能读取到冒号，说明就是header头部
                else if(temp.indexOf(":")!=-1){
                    //不管有没有匹配到host字段，都将按顺序将字段存储到map中
                    //如果匹配到host字段，就提取其值
                    if(temp.substring(0,4).equals("Host")){
                        host=temp.substring(temp.indexOf(":")+1).trim();  //成功截取Host字段
                        fullUrl=host+dirctory;    //不包含协议的url地址
                    }

                    //将header按顺序加入map中
                    headerKey=temp.substring(0,temp.indexOf(":"));
                    headerValue=temp.substring(temp.indexOf(":")+1).trim();
                    headerLinkedHashMap.put(headerKey,headerValue);
                }
            }
        }

    }

}
