package com.imooc;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args){
        /*
        * 随意输入一个数字，算阶乘的和。比如输入4
        * 4的阶乘=1*2*3*4
        * 4的阶乘和=1*1 + 1*2 + 1*2*3 + 1*2*3*4
        * 底部再输出4行4列的星号
         */
        Scanner input=new Scanner(System.in);
        //计算阶乘
        while (true){
            //总和
            long sum=0;
            System.out.println("请输入一个整数，计算阶乘(退出0)：");
            int num=input.nextInt();
            if(num==0){
                System.out.println("谢谢使用！再见！");
                break;
            }
            //若不退出则开始计算
            //外层整体循环
            for(int i=1;i<=num;i++){
                //内部个体循环,计算1*2*3*4...*n
                long insideSum=1;
                for(int m=1;m<=i;m++){
                    insideSum*=m;
                }
                //求和
                sum+=insideSum;
            }
            //输出结果、归零
            System.out.println("结果为："+sum);
            sum=0;

        }
        //输出金字塔星号
        while (true){
            System.out.println("请输入星号的数量（比如4代表4行列，0退出）");
            int starNum=input.nextInt();
            //判断是否退出
            if(starNum==0){
                System.out.println("打印金字塔结束，谢谢使用");
                break;
            }
            //行数循环
            for(int i=1;i<=starNum;i++){
                //每行星号数量循环打印
                for(int m=1;m<=i;m++){
                    System.out.print("*");
                }
                //每行打印完要换行
                System.out.print("\n");
            }
        }

        //输出奇数的和
        while (true){
            System.out.println("输入数字，计算这个数字之前的奇数和（0退出）：");
            int maxNum=input.nextInt();
            if(maxNum==0){
                System.out.println("谢谢使用求奇数和程序");
                break;
            }
            long oddNumberSum=0;
            //累加奇数和
            for(int i=1;i<=maxNum;i++){
                if(i%2==0){
                    continue;
                }
                else {
                    oddNumberSum+=i;
                }
            }
            //输出结果，一定要归零！
            System.out.println("奇数和结果为："+oddNumberSum);
            oddNumberSum=0;
        }


    }
}
