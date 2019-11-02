package com.study.exception;

/**
 * 判断用户输入类型，决定是否抛出异常
 *
 */
public class Judge {
    //默认构造方法
    public Judge(){

    }
    //判断抛出哪种异常
    public void whoThrow(int index) throws Exception{
        //1.抛出字母异常：“你输入的是字母，不符合要求”
        if(index==1){
            throw new Exception("你输入的是字母，不符合要求，请输入数字！");
        }
        //2.抛出数字异常
        else if(index==2){
            throw new Exception("你输入的是特殊符号，不符合要求，请输入数字！");
        }
    }
}
