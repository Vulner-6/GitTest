package com.socket.udpProject;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessage implements Runnable {
    private static int port;
    public void run(){
        try{
            receiveUDP(port);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //构造方法
    public ReceiveMessage(int receivePort){
        port=receivePort;
    }
    //不断接收数据包的线程
    public void receiveUDP(int port) throws Exception{
        //设置监听端口
        DatagramSocket ds=new DatagramSocket(port);
        while (true){
            //构造接收包
            byte[] bytes=new byte[1024];
            int length=bytes.length;
            DatagramPacket dp=new DatagramPacket(bytes,length);
            ds.receive(dp);

            //显示接收到的内容
            String strOutput=new String(dp.getData());
            System.out.println("接收的信息："+strOutput);

        }
    }
}
