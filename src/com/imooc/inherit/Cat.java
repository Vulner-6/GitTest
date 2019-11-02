package com.imooc.inherit;

public class Cat extends Animal {
    public Cat(){
        //猫构造方法
        System.out.println(this.getName()+":喵喵～");
    }

    private String attrName;
    public void setAttrName(String attrName){
        this.attrName=attrName;
    }
    public String getAttrName(){
        return this.attrName;
    }

    //猫的独有属性
    public void run(){
        System.out.println(this.getName()+"会上树，因为我是"+this.getAttrName());
    }

    /**
     * 方法的重载：
     * 1.同一个类中的方法可以重载
     * 2.方法名相同，参数列表不同就可以重载（参数顺序、个数、类型，只要一个不一样就会重载）
     * 3.访问修饰符，方法返回值不会影响是否重载
     * 4.是否重载与方法的参数名无关！只和参数的  顺序、个数、类型  有关！！！
     */

    /**
     * 方法的重写：
     * 子类与父类的   返回值类型、方法名、参数类型顺序个数   必须一致
     * 通俗的说，就是复制粘贴，修改方法内部逻辑而已。
     * 1.访问修饰符是否需要变化？
     * 2.与方法的参数名无关！
     * 3.子类中属性也可以和父类重名，但是子类的优先级更高。
     */
    public void speak(){
        System.out.println(this.getName()+"：喵喵～喵喵～");
    }
}
