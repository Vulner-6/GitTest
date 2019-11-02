package com.java.thread;

public class Thread01 extends Thread{
    //启动一个线程需要继承Thread类，并重写run方法。
    public void run(){
        for(int i=0;i<500;i++){
            //判断线程状态是否中断
            if(interrupted()){
                System.out.println("线程中断");
                int index=66666;
                break;
            }
            System.out.println(i);
        }
    }
}
