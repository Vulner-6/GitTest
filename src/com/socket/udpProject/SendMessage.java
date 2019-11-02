package com.socket.udpProject;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessage implements Runnable {
    //设置发送到目标的端口
    private static int port;
    public void run(){
        System.out.println("欢迎来到XXX聊天室～～～");
        sendUDP(port);

    }

    //构造方法
    public SendMessage(int dsport){
        port=dsport;
    }

    public void sendUDP(int port){
        while (true){
            //获取用户输入
            Scanner scanner=new Scanner(System.in);
            System.out.println("发送的消息（end结束）：");
            String strInput=scanner.next();

            try{
                //建立socket连接
                DatagramSocket ds=new DatagramSocket();
                //构造udp请求包
                byte[] bytes=strInput.getBytes();
                int length=bytes.length;
                InetAddress inetAddress=InetAddress.getByName("PC-PC");
                DatagramPacket dp=new DatagramPacket(bytes,length,inetAddress,port);
                //发送请求包
                ds.send(dp);
                //判断用户是否要结束
                if(strInput.equals("end")){
                    ds.close();
                    System.out.println("谢谢使用XXX匿名聊天室！");
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
