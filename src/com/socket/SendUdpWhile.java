package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendUdpWhile {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input="";
        while (true){
            //获取用户输入
            System.out.println("消息（回车键发送，输入end退出）：");
            input=scanner.next();
            try{
                //声明一个套接字对象
                DatagramSocket ds=new DatagramSocket();
                //构造发送的UDP包:内容，长度，地址，端口
                byte[] bytes=input.getBytes();
                int length=bytes.length;
                InetAddress inetAddress=InetAddress.getByName("PC-PC");
                int port=9965;
                DatagramPacket dp=new DatagramPacket(bytes,length,inetAddress,port);
                //发送数据包
                ds.send(dp);
                //判断用户输入是否是end
                if(input.equals("end")){
                    ds.close();
                    break;
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }
        System.out.println("虽然代码写的有缺陷，但是欢迎使用。");



    }
}
