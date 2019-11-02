package com.object;

public class CatTest {
    /**
     * 测试Cat类的方法
     */
    public static void main(String[] args){
        Cat mike=new Cat();
        mike.run();
        mike.eatFish();
        mike.name="Mike";
        mike.age=11;
        mike.selfInfo(mike.name,mike.age);
    }
}
