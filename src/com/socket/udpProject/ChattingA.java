package com.socket.udpProject;

public class ChattingA {
    public static void main(String[] args){
        //指定目的端口，循环发送用户输入
        SendMessage sendMessage=new SendMessage(15535);
        Thread threadSend=new Thread(sendMessage,"发送数据包的线程");
        threadSend.start();

        //不断接收数据包，并显示内容
        ReceiveMessage receiveMessage=new ReceiveMessage(7789);
        Thread threadReceive=new Thread(receiveMessage,"接收数据包的线程");
        threadReceive.start();

    }
}
