package com.java.thread;

/**
 * 测试Runnable的用法
 * 优点：1.只是实现接口，因此还可以继承其他类，可扩展性强
 *      2.可以让多个线程，数据共享。若不想共享，那么可以多声明几个对象。
 */
public class TestRunnable {
    public static void main(String[] args){
        Runnable01 runnable01=new Runnable01();
        //传递一个Runnable子线程，并命名为Runnable线程1
        Thread t1=new Thread(runnable01,"Runnable线程1");
        t1.start();
        Thread t2=new Thread(runnable01,"Runnable线程2");
        t2.start();

        //测试两个线程共享数据
        runnable01.addData("66666666");

        //测试匿名内部类
        Runnable runnable02=new Runnable() {
            @Override
            public void run() {
                System.out.println("---------------");
            }
        };
        Thread t3=new Thread(runnable02,"匿名内部类");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        t3.start();

    }
}
