package com.imooc;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        //几种可读性差但是又必须能看懂的写法
        int x=4;
        int y=(x++)+x;    //这里y的值是9，必须搞清楚原理！
        System.out.println("x="+x+",y="+y);

        int a=4;
        int b=(++a)+a;    //估计输出10
        System.out.println("a="+a+",b="+b);

        //运算，除法运算注意事项
        double result=(b/a);
        System.out.println("整数除整数结果："+result);   //即便声明结果为浮点型，但是除法还有问题
        System.out.println("浮点数除整数结果："+(float)b/a);

        //仔细体会下面的三种结果
        double resultFloat=10/3;
        System.out.println("10/3="+resultFloat);
        resultFloat=10/3.0;
        System.out.println("10/3="+resultFloat);
        resultFloat=10.0/3;
        System.out.println("10/3="+resultFloat);

        //比较运算符，字符可以比较
        final char A='A',B='B';
        boolean booleanResult=A<B;   //返回true
        //比较运算符，float和int值相等那么就相等
        float f1=5.0f;
        int int1=5;
        if(f1==int1){
            System.out.println("float型和int型只要值相等，变量就相等");
        }

        //条件运算符
        int t1=1,t2=2;
        int max;
        max=t1>t2?t1:t2;

        //switch练习
        System.out.println("请输入1-7的纯数字：");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        switch (num){
            case 1:
                System.out.println("星期1");
                break;
            case 2:
                System.out.println("星期2");
                break;
            case 3:
                System.out.println("星期3");
                break;
            case 4:
                System.out.println("星期4");
                break;
            case 5:
                System.out.println("星期5");
                break;
            default:
                System.out.println("休息日");

        }

    }
}
