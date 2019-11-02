package com.object;

public class ConstructFun {
    /**
     * 1.构造方法必须和类名一致！
     * 2.构造方法没有返回值！！！
     * 3.构造方法只能在对象实例化的时候使用。
     * 4.当没有指定构造方法的时候，系统会自动添加一个无参的构造方法。
     * 5.this()会默认调用无参构造方法
     * 6.构造方法中设置属性的值，最好也用封装方法。否则容易出现逻辑错误。
     */
    public ConstructFun(){
        //无参构造方法
        System.out.println("我是无参构造方法");
    }
    public ConstructFun(String input){
        //有参构造方法
        this();   //是否会调用无参构造方法？
        System.out.println("我是有参构造方法");
    }
    String conName;
    boolean isReturn;
    String whenUse;
    String systemAdd;
    //设置属性
    public void setConName(String conName){
        this.conName=conName;
    }
    public void setIsReturn(boolean isReturn){
        this.isReturn=isReturn;
    }
    public void setWhenUse(String whenUse){
        this.whenUse=whenUse;
    }
    public void setSystemAdd(String systemAdd){
        this.systemAdd=systemAdd;
    }

    //校验方法
    public void output(){
        System.out.println("注意事项如下：\n"+conName+isReturn+whenUse+systemAdd);
    }

}
