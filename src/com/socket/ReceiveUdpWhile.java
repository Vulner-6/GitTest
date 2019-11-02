package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveUdpWhile {
    public static void main(String[] args){
        //声明一个接收的socket，需要指明接收的端口
        try {
            DatagramSocket ds=new DatagramSocket(9965);
            //一直接收，每次接收一个包的信息之前，都声明一个接收的容器
            while (true){
                byte[] bytes=new byte[1024];
                int length=bytes.length;
                DatagramPacket dp=new DatagramPacket(bytes,length);
                ds.receive(dp);
                String str=new String(dp.getData());
                System.out.println("客户端发送的消息："+str+"----"+dp.getAddress()+":"+dp.getPort());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
