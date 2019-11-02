package com.imooc.telphone;

public class SelectInterface implements InterfacePhoto,InterfacePhoto2 {
    public void photo(){
        //重写InterfacePhoto方法
        System.out.println("我是SelectInterface实现类中重写的photo方法");
    }
    /**
     * 由于实现的两个接口有相同名称的默认类，所以这里发生冲突，报错了。
     * 解决这种问题的方法就是，实现类中自己重写接口的默认方法
     */
    public void connect(){
        System.out.println("我是SelectInterface中为了解决接口中两个相同名称默认类的问题");
    }
}
