package com.study.exception;

public class DrunkException extends Exception {
    public DrunkException(){
        //什么都不做，默认无参构造方法
    }
    public DrunkException(String message){
        //调用Exception类中的构造方法，设置抛出的异常信息
        super(message);
    }
}
