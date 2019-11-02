package com.imooc;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args){
        //猜数字游戏
        //生成一个随机数
        int randomNum=(int)((Math.random())*10);
        Scanner input=new Scanner(System.in);
        int guessNum=0;
        do{
            System.out.println("请输入数字：");
            guessNum=input.nextInt();
            //判断输入的值是否正确
            if(guessNum<randomNum){
                System.out.println("猜小了！");
            }else if(guessNum>randomNum){
                System.out.println("猜大了！");
            }else{
                System.out.println("猜对了！");
                break;
            }
        }while (true);
    }
}
