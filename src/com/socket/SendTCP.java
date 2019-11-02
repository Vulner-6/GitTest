package com.socket;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class SendTCP implements Runnable{
    //默认目的地址，端口
    private int dsPort=9635;
    private String dsAddress="192.168.41.3";

    //无参构造方法
    public SendTCP(){

    }

    //带参构造方法
    public SendTCP(String address,int port){
        setDsPort(port);
    }

    //getter and setter
    public void setDsPort(int port){
        this.dsPort=port;
    }

    public int getDsPort(){
        return this.dsPort;
    }

    public String getDsAddress() {
        return dsAddress;
    }

    public void setDsAddress(String dsAddress) {
        this.dsAddress = dsAddress;
    }

    //实现run方法
    public void run(){
        //循环发送TCP包
        while (true){
            String str=getUserInput();
            if(str.equals("end")){
                System.out.println("谢谢使用，再见");
                break;
            }
            try{
                sendTcpPacket(str);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //发送一个TCP数据包
    public void sendTcpPacket(String content) throws Exception{
        //增加提示信息
        System.out.println("正在建立连接……");
        //发送建立socket连接的请求，需要抛出异常
        Socket socket=new Socket(dsAddress,dsPort);
        //增加提示信息
        System.out.println("连接建立成功！");
        //TCP发送数据需要生成输出流
        OutputStream outputStream=socket.getOutputStream();
        //发送请求内容
        outputStream.write(content.getBytes());
        //断开连接，但是感觉发一次消息就断开一次连接好像不好
        socket.close();
    }

    //获取用户输入
    public String getUserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("发送：");
        String str=scanner.next();
        return str;
    }
}
