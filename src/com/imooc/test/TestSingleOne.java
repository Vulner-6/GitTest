package com.imooc.test;

import com.imooc.single.SingleOne;

public class TestSingleOne {

    public static void main(String[] args){
        SingleOne one=SingleOne.getTemp();
        SingleOne two=SingleOne.getTemp();
        System.out.println(one+"\n"+two);
    }
}
