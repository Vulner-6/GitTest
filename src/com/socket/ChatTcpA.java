package com.socket;

public class ChatTcpA {
    public static void main(String[] args){
        //开启发送数据包的线程,默认发送到9635端口
        SendTCP sendTCP=new SendTCP();
        Thread sendThread=new Thread(sendTCP,"发送TCP数据包的线程");
        sendThread.start();

        //开启接收数据包的线程
        ReceiveTCP receiveTCP=new ReceiveTCP(9636);
        Thread receiveThread=new Thread(receiveTCP,"接收TCP数据包的线程");
        receiveThread.start();
    }
}
