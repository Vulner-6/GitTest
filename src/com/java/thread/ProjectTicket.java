package com.java.thread;

public class ProjectTicket {
    public static void main(String[] args){
        ThreadTicket threadTicket=new ThreadTicket();
        Thread thread01=new Thread(threadTicket,"售票店1");
        Thread thread02=new Thread(threadTicket,"售票店2");
        Thread thread03=new Thread(threadTicket,"售票店3");
        Thread thread04=new Thread(threadTicket,"售票店4");

        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
    }
}
