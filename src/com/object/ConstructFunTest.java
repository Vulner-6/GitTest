package com.object;

public class ConstructFunTest {
    public static void main(String[] args){
        ConstructFun test=new ConstructFun("test");
        test.setConName("构造方法\n");
        test.setIsReturn(false);
        test.setSystemAdd("若没有手动添加构造方法，系统会自动默认增加一个无参构造方法\n");
        test.setWhenUse("\nnew一个对象的时候会调用\n");
        test.output();
    }
}
