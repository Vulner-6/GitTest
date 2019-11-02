package com.java.thread;

public class Runnable01 implements Runnable {
    //假设共享数据
    String data="";
    public void run(){
        //获取当前线程
        Thread t=Thread.currentThread();
        for(int i=0;i<100;i++){
            System.out.println(t.getName()+":"+i);
        }
        System.out.println(data);
    }

    public void addData(String str){
        this.data=this.data+str;
    }
}
