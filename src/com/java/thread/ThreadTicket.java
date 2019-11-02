package com.java.thread;

public class ThreadTicket implements Runnable {
    int ticketNum=100;
    int index=0;
    //声明一个对象，作为线程锁
    Object lock=new Object();
    public void run(){
        while (true){
            Thread threadId=Thread.currentThread();
            //设置线程锁，每一个线程来的时候，就锁上，执行完代码，就解锁。
            synchronized (lock){
                if(ticketNum>0){
                    System.out.println(threadId.getName()+"卖出序号"+ticketNum+"的票");
                    ticketNum--;
                }
            }
            synOutput();
        }
    }
    //同步方法,自动给方法内的代码上锁
    public synchronized void synOutput(){
        while (true){
            Thread threadId=Thread.currentThread();
            if(ticketNum==0&&index<100){
                System.out.println(threadId.getName()+"========================="+index);
                index++;
            }
            else {
                break;
            }
        }

    }
}
