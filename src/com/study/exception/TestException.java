package com.study.exception;

public class TestException {
    /**
     * 异常的所有测试案例
     */
    public static void main(String[] args) {
        //TestOne
        TestOne testOne=new TestOne();
        float result=testOne.test1();
        System.out.println(result);

        System.out.println("=================================");

        //TestThrow中，当用户可以处理抛出异常的时候
        TestThrow testThrow=new TestThrow();
        try{
            testThrow.testThrows(5,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //当用户无法处理抛出异常的情况(提示必须捕获异常)
        //testThrow.testThrows2();

        System.out.println("==============================");

        //测试DrunkException和ChainTest
        ChainTest chainTest=new ChainTest();
        try{
            chainTest.test2();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
