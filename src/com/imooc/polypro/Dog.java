package com.imooc.polypro;

public class Dog extends Animal {
    //性别
    private String sex;

    //默认无参构造方法
    public Dog(){
        //构造方法无返回值
    }

    //带参构造方法
    public Dog(String name,int age,String sex){
        super(name,age);
        setSex(sex);
    }
    //Dog独有的睡觉方法
    public void sleep(){
        System.out.println("Dog会睡觉～");
    }
    //重写父类eat方法
    public void eat(){
        System.out.println("狗会啃骨头～");
    }
    //getter和setter

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
