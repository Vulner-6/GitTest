package com.object;

public class Cat {
    /**
     * 1.同一个包中的类，可以直接使用其他类中的方法而不需要导
     * 2.一个包中，我觉得最好有一个主类，主类中包含入口函数比较好
     */
    //猫的属性：名字、年龄
    String name;
    int age;

    //猫的方法：吃鱼、跑步
    public void eatFish(){
        System.out.println("猫在吃鱼");
    }
    public void run(){
        System.out.println("猫在跑步");
    }
    //猫的自我介绍
    public void selfInfo(String name,int age){
        System.out.println("我的名字是："+name+"\n"+"我的年龄是："+age);
    }

}
