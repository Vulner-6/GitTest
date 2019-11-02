package com.demo.usepackage;

public class StaticUseTest {
    public static void main(String[] args){
        StaticUse test=new StaticUse();
        test.setName("虎纹猫");
        test.setAge(88);

        //static静态方法是共用一块空间
        test.company="野生动物协会";     //不推荐的写法
        StaticUse.company="宠物集中营";   //官方写法

        System.out.println("名字"+test.getName()+"\n年龄："+test.getAge()+"\n公司："+StaticUse.company);

        //调用静态方法
        StaticUse.testStatic();


    }
}
