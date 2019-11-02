package com.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveTCP implements Runnable {
    //默认本地监听端口
    private int listenPort=9635;
    //默认无参构造方法
    public ReceiveTCP(){

    }
    //默认带参构造方法
    public ReceiveTCP(int listenPort){
        setListenPort(listenPort);
    }

    //getter and setter
    public int getListenPort() {
        return listenPort;
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    public void run(){
        while (true){
            try {
                receivePacket(getListenPort());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void receivePacket(int listenPort) throws Exception{
        //创建接收socket
        ServerSocket serverSocket=new ServerSocket(listenPort);
        //开始接收客户端发送的socket(当客户端new socket的时候，服务端就accept了)
        Socket clentSocket=serverSocket.accept();
        //提示信息
        System.out.println("成功接收到一个客户端连接！");
        //针对客户端的输出流，创建接收流
        InputStream inputStream =clentSocket.getInputStream();
        //取出接收流中的内容
        byte[] bytes=new byte[1024];
        int length=inputStream.read(bytes);
        String str=new String(bytes,0,length);
        System.out.println("接收："+str);
        //关闭客户端socket
        clentSocket.close();
        //关闭服务端socket
        serverSocket.close();
    }
}
