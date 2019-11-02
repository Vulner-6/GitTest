package com.imooc.inherit;

/**
 * 父类，拥有名字、年龄私有属性。
 * 拥有说话方法
 */
public class Animal {
    public Animal(){
        //构造方法，先测试一下
        System.out.println("我继承Animal父类");
    }

    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    //说话方法
    public void speak(){
        System.out.println("我的名字是："+this.name+"\n我的年龄是："+this.age);
    }
}
