package com.imooc.single;

/**
 * 饿汉模式
 */
public class SingleTwo {
    //创建私有构造方法
    private SingleTwo(){

    }
    //创建静态的该类实例对象
    private static SingleTwo two;
    //创建开放的静态方法提供实例对象
    public static SingleTwo getInstance(){
        if(two==null){
            two=new SingleTwo();
        }

        return two;
    }


}
