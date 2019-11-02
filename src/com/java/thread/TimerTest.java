package com.java.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试定时器的使用
 */
public class TimerTest {
    public static void main(String[] args){
        MyTimer myTimer=new MyTimer();
        //创建一个定时对象
        Timer t=new Timer();
        t.schedule(myTimer,2000,3000);

    }
}

class MyTimer extends TimerTask {
    public void run(){
        //编写定时器要执行的代码
        System.out.println("定时任务");
    }
}
