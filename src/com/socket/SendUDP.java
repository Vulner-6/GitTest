package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendUDP {
    public static void main(String[] args) throws Exception{
        //声明一个套接字对象,需要解决异常，因此这里throws了，我猜测利用try也是可以的
        DatagramSocket ds=new DatagramSocket();

        //构造一个udp包:字节内容，包长度，目的地址，端口号
        byte[] buf="我是一个好人，好人有好报！".getBytes();
        int length=buf.length;
        InetAddress inetAddress=InetAddress.getByName("PC-PC");
        int port=7898;
        DatagramPacket datagramPacket=new DatagramPacket(buf,length,inetAddress,port);

        //发送一个数据包
        ds.send(datagramPacket);

        //每次结束都要释放资源
        ds.close();

        //打印看看能否获取本地地址
        System.out.println(inetAddress);

    }
}
