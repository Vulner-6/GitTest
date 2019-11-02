package com.imooc.polypro;

public class Cat extends Animal {
    //猫多一个体重私有属性
    private double weight;
    public Cat(){
        //默认无参构造方法
    }

    public Cat(String name,int age,double weight){
        //必须第一行，调用父类构造方法
        super(name,age);
        this.weight=weight;
    }

    //猫有跑的方法
    public void run(){
        System.out.println("猫在跑动");
    }

    //猫重写父类eat方法
    public void eat(){
        System.out.println("Cat是吃鱼～");
    }

    //getter和setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
