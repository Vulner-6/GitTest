package com.study.exception;

/**
 * 1.抛出异常语法
 * 2.try{}catch(){}语句
 */
public class TestThrow {
    float result=0;
    //声明将要抛出何种类型的异常
        //throws后接异常列表，逗号分隔
    public void testThrows(int one,int two) throws Exception{
        //调用会抛出异常的方法，或者直接抛出一个异常
        if(two==0){
            throw new Exception("两数相除，除数不可以为0");
        }
        else {
            System.out.println("两数相除："+one+"/"+two+"="+one/two);
        }
    }

    //如果用户无法处理抛出的异常，就用下面方法
    public void testThrows2() throws Exception{
        testThrows(5,0);
    }
}
