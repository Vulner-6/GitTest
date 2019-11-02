package com.imooc.test;

import com.imooc.polypro.Animal;
import com.imooc.polypro.Cat;
import com.imooc.polypro.Dog;
import com.imooc.polypro.Master;

public class TestPolyPro {
    public static void main(String[] args){
        Animal one=new Animal();
        Animal two=new Cat();
        Animal three=new Dog();

        //向上转型
        one.eat();
        two.eat();
        three.eat();
        //向上转型无法使用子类独有的方法

        System.out.println("===================================");

        //向下转型,又是强制类型转换.前提是该实例有对应类的潜力
        Cat four=(Cat)two;
        four.eat();
        four.run();
        if(three instanceof Dog){
            Dog d1=(Dog)three;
            d1.eat();
            d1.sleep();
        }

        System.out.println("====================================");

        Animal temp;
        Master mine=new Master();
        mine.feed(four);
        temp=mine.isHasTime(true);


    }
}
