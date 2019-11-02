package com.demo.usepackage;

public class StaticUse {
    /**
     * 1.静态方法、成员的修饰符是static。类中的静态方法、成员是共用的一块内存空间
     * 2.调用静态成员：类名.成员名=赋值
     * 3.没有静态类！！！只有静态属性、静态方法
     * 4.方法内不能用static修饰局部变量，只能用final来设置常量
     * 5.静态方法不能直接访问非静态方法，而非静态方法却能直接访问静态方法
     * 6.静态方法若想使用非静态方法，那么需要在静态方法中先实例化对象。
     * 7.静态代码块：类加载时调用，优先于构造代码块。构造代码块创建对象时调用，优先于构造方法。
     *   静态代码块-->构造代码块-->构造方法-->普通方法
     * 8.静态代码块，无论创建多少对象，只实例化一次。（第一次类加载的时候实例化一次）
     */
    private String name;
    private int age;
    static String company;
    public double price;

    //generate setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //generate getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //静态方法
    public static void testStatic(){
        System.out.println("这是没有返回值的静态方法，推荐 类名.方法名 进行调用");

    }
}
