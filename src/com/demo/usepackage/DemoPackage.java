package com.demo.usepackage;  //定义包

import com.object.CatTest;
import com.imooc.*;

public class DemoPackage {
    /**
     * 1.包命名规则：域名倒序+模块+功能
     * 2.同一个包中不能存在相同名字的类
     * 3.包名全部小写
     * 4.定义包必须放在java文件第一行
     * 5.建议每个包中存储的类文件功能都是相关联的
     * 6.加载其他包中类，有三种方法：
     *   import com.object.*;        直接导入com.object包中的所有类，不会递归查询所有子包
     *   import com.imooc.Function;    导入包中的指定类
     *   com.imooc.Cat testCat=new com.imooc.Cat();      直接在程序中指定某个方法使用。
     *   （但是idea会自动import用到的类。。。不需要手动去指定导入。。。除非两个包中有相同名字的类才
     *   需要手动导入）
     * 7.关于导入包中同名类，使用优先级的关系：指定类的优先级更高。
     */
    public static void main(String[] args){
        //使用com.object包中的所有类。
        CatTest test2=new CatTest();
        //直接在程序中声明指定包的对象，然后才能使用对应的方法
        com.object.Cat test3=new com.object.Cat();

        Cat tt = new Cat();
    }
}
