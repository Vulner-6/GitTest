package com.imooc.test;

import com.imooc.people.Persion;

public class TestPersion {
    public static void main(String[] args){
        Persion lili=new Persion();

        /**
         * 获取成员内部类实例的三种方法
         * 1.通过直接声明外部类.内部类的方式实例化
         * 2.通过外部类的实例，进行内部类的实例化
         * 3.通过外部类的方法，返回内部类对象
         */
        //Persion.Heart liliHeart=new 外部类.new 内部类
        Persion.Heart liliHeart=new Persion().new Heart();
        liliHeart.beat();
        //lili.new 内部类
        Persion.Heart liliHeart2=lili.new Heart();
        liliHeart2.beat();
        //lili.getHeart()
        Persion.Heart liliHeart3=lili.getHeart();
        liliHeart3.beat();
    }
}
