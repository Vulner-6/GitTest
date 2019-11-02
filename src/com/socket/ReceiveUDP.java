package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收一个套接字
 */
public class ReceiveUDP {
    public static void main(String[] args){
        try {
            //声明一个socket,这里需要填入接收端的端口(必须和发送端端口一致)
            DatagramSocket ds=new DatagramSocket(7898);
            //声明一个接收端的包来接收发送过来的udp包,容器大小为1024
            byte[] buf=new byte[1024];
            int length=buf.length;
            //由于是接收端的包，所以只需要填入接收内容，以及长度
            DatagramPacket dp=new DatagramPacket(buf,length);

            //开始接收
            ds.receive(dp);

            //获取接收到的内容,被String转换成字符串了
            String str=new String(dp.getData());
            System.out.println(str);
            System.out.println("源IP："+dp.getAddress()+":"+dp.getPort());

            //必须记得释放资源
            ds.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
