package com.imooc.polypro;

public class Animal {
    //动物属性：名字，年龄
    private String name;
    private int age;

    public Animal(){
        //默认无参的构造方法
    }

    public Animal(String name,int age){
        //带参的构造方法
        this.name=name;
        this.age=age;
    }

    //吃东西的方法
    public void eat(){
        System.out.println("Animal都有吃东西的能力");
    }

    //getter和setter
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
