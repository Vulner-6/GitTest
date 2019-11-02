package com.imooc.single;
/**
 * 饿汉式单例模式：创建对象实例的时候直接初始化
 */

public class SingleOne {
    //1.创建类中私有构造方法
    private SingleOne(){

    }

    //2.创建该类型的私有静态实例
    private static SingleOne temp=new SingleOne();

    //3.创建公有静态方法返回静态实例对象
    public static SingleOne getTemp(){
        return temp;
    }
}
