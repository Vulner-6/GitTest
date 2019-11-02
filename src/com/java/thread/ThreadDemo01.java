package com.java.thread;

/**
 * 测试多线程执行的主类
 */
public class ThreadDemo01 {
    //程序入口
    public static void main(String[] args){
        //获取当前主线程,并打印输出主线程优先级
        Thread mainThread=Thread.currentThread();
        System.out.println("主线程优先级为："+mainThread.getPriority());

        //设置线程名字，若不设置，默认获取系统命名的线程名字
        mainThread.setName("主线程mainThread");
        System.out.println("名字是："+mainThread.getName());

        //启动一个自己写的子线程
        Thread01 thread01=new Thread01();
        //查看线程优先级，thread01是子线程
        System.out.println("第一个子线程的优先级为："+thread01.getPriority());
        //启动该线程
        thread01.start();

        //中断线程
        try {
            Thread.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }
        thread01.interrupt();
        //将原本并行的线程，利用join方法变成串行
        Thread02 thread02=new Thread02();
        thread02.start();
        try{
            thread02.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        //对比输出结果（主程序中的是主线程）
        for(int i=0;i<500;i++){
            System.out.println(i+0.1);
        }
        //线程休眠
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(mainThread.getName()+"休眠了3秒");
    }
}
