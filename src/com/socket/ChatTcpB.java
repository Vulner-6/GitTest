package com.socket;

public class ChatTcpB {
    public static void main(String[] args){
        //开启接收数据包的线程，默认接收端口9635
        ReceiveTCP receiveTCP=new ReceiveTCP();
        Thread receiveThread=new Thread(receiveTCP,"接收TCP数据包的线程");
        receiveThread.start();

        //开启发送数据包的线程,默认发送到9635端口，这里设置为9636
        SendTCP sendTCP=new SendTCP("127.0.0.1",9636);
        Thread sendThread=new Thread(sendTCP,"发送TCP数据包的线程");
        sendThread.start();
    }
}
