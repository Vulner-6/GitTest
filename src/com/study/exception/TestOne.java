package com.study.exception;
/**
 * 第一个异常程序
 * 学习写法，测试有无finally的区别
 */

public class TestOne {
    int num1=100;
    int num2=3;
    float result=0f;
    public TestOne(){

    }
    public float test1(){
        try{
            while(num2>-1){
                result=num1/num2;
                num2--;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("除数不能为0");
            return result;
        }
        finally {
            System.out.println("我是finally");
            return result;
        }

    }


}
