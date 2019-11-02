package com.java.thread;

public class Thread02 extends Thread {
    public void run(){
        for(int i=0;i<500;i++){
            System.out.println("------------------------"+i);
        }
    }
}
