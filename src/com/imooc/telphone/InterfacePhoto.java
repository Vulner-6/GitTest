package com.imooc.telphone;

/**
 * 拍照接口
 */
public interface InterfacePhoto {
    //接口不需要具体的方法细节
    public void photo();
    public static int TEMP=20;
    /**
     * jdk1.8后，接口中可以设置静态方法和默认方法。
     * 静态方法和默认方法在实现的实例中可以不重写，也不会报错。
     * 调用方式，静态方法：接口名+方法名    默认方法：对象+方法名
     *
     * 默认方法是可以被重写的，而静态方法是不可以的
     */
    default void connect(){
        System.out.println("接口中的默认方法");
    }
    static void stop(){
        System.out.println("接口中的静态方法");
    }


}
