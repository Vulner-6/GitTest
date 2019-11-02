package com.study.exception;

/**
 * test1抛出喝大了异常
 * test2捕获test1中喝大了异常，并包装成运行时异常，继续抛出
 * main方法中，调用test2，尝试捕获test2方法抛出的异常
 */
public class ChainTest {
    //抛出喝大了异常
    public void test1() throws DrunkException{
        throw new DrunkException("喝酒别开车");
    }
    //捕获喝大了异常，包装成运行时异常
    public void test2(){
        try {
            test1();
        }
        catch (Exception e){
            RuntimeException newExc=new RuntimeException("司机一滴酒，亲人两行泪");
            newExc.initCause(e);
            throw newExc;

        }

    }
}
