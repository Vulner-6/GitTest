package com.imooc;

import java.util.Scanner;

public class Function {
    public static void main(String[] args){
        //主方法，程序运行的地方
        //开始调用自定义方法
        Function test=new Function();
        test.printStar();
        System.out.println("欢迎练习自定义方法");
        test.printStar();
        //计算面积，方法有返回值
        System.out.println("1.计算长方形面积的方法调用：");
        double result=test.area();
        System.out.println("面积为："+result);

        //计算两个float的最大值
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        float num1=input.nextFloat();
        System.out.println("请输入第二个数：");
        float num2=input.nextFloat();
        test.maxfloat(num1,num2);

        //阶乘方法的使用
        System.out.println("请输入阶乘的数：");
        long facResult=test.fac(input.nextInt());
        System.out.println("阶乘结果和："+facResult);
    }

    //自定义方法（无参数无返回值）
    public void printStar(){
        System.out.println("********************");
    }

    //自定义返回长方形面积的方法（无参数有返回值）
    public double area(){
        Scanner input=new Scanner(System.in);
        System.out.print("请输出长方形的长：");
        double length=input.nextDouble();
        System.out.print("\n请输入长方形的宽:");
        double width=input.nextDouble();
        return length*width;
    }

    //自定义比较两个float类型数值大小的方法（有参数无返回值）
    public void maxfloat(float num1,float num2){
    if(num1>num2){
            System.out.println("最大值为："+num1);
        }
        else{
            System.out.println("最大值为："+num2);
        }
    }

    //自定义求阶乘的方法(有参有返回值)
    public long fac(int num){
        long sum=0;
        for(int i=1;i<=num;i++){
            long insideSum=1;
            for(int j=1;j<=i;j++){
                insideSum*=j;
            }
            sum+=insideSum;
        }
        return sum;

    }
}
