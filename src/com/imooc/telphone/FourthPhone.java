package com.imooc.telphone;

/**
 * 第四代手机，可以打游戏
 */
public class FourthPhone extends ThirdPhone implements InterfacePhoto{
    public void game(){
        System.out.println("手机可以打游戏");
    }
    public void photo(){
        System.out.println("第四代手机也可以拍照");
    }
    public static int TEMP=30;

    //重写接口中的默认方法，但是却不需要加上default关键字
    public void connect(){
        System.out.println("实现类中重写接口的connect方法");
        //调用接口中的默认方法
        InterfacePhoto.super.connect();
    }
}
