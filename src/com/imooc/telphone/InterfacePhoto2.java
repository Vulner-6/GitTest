package com.imooc.telphone;

public interface InterfacePhoto2 {
    default void connect(){
        System.out.println("接口2中的connect方法");
    }
}
