package com.imooc.telphone;

public class Camera implements InterfacePhoto{
    //选择接口后，必须实现接口中的方法
    public void photo(){
        System.out.println("相机可以拍照");
    }
}
