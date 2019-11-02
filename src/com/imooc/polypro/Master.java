package com.imooc.polypro;

public class Master {
    //喂养动物的方法
    public void feed(Animal obj){
        if(obj instanceof Cat){
            Cat c1=(Cat)obj;
            c1.eat();
        }
        else if(obj instanceof Dog){
            Dog d1=(Dog)obj;
            d1.eat();
        }
    }
    //是否有充足时间
    public Animal isHasTime(Boolean yes){
        if(yes){
            System.out.println("有充足的时间内遛狗");
            return new Dog();
        }
        else{
            System.out.println("没有足够的时间养猫");
            return new Cat();
        }
    }

}
