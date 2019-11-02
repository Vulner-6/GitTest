package com.imooc;

import java.util.Scanner;

public class ArrayKnowledge {
    /*
    * 1.数组声明，两种格式：
    *   数据类型[] 数组名;    如 int[] a;
    *   数据类型 数组名[];    如 int a[];
    *   数组和类、接口一样，都是引用数据类型
    * 2.数组的创建，两种格式：
    *   int[] arr;  arr=new int[10];
    *   int[] arr=new int[10];
    * 3.数组的初始化:声明数组的同时给数组赋值
    *   int[] a={1,2,3,4,5}
    * 4.数组长度：arr.length   (实际上数组是一个对象)
    * 5.增强型for循环——foreach:
    *   int[] arr={1,2,3,4,5};
    *   for(int n:arr){
    *       System.out.println(n);
    *   }
    * 6.最后实现一下冒泡算法
     */
    public static void main(String[] args){
        //两种方式声明两个数组
        //第一种，先声明再创建
        int[] arr1;
        arr1=new int[10];
        //第二种，声明的同时就创建。
        String[] arr2=new String[5];

        //初始化数组
        char[] ch={'a','b','c'};

        //给创建好的数组赋值，需要使用循环。注意下标和长度的关系，容易出错。
        for(int i=0;i<arr1.length;i++){
            arr1[i]=i+1;
            System.out.println("数组下标"+i+"的值为："+arr1[i]);
        }

        //接收5个数据，打印出来，并计算累加和
        Scanner input=new Scanner(System.in);
        double[] numList=new double[5];
        double sum=0;
        System.out.println("请输入5个数字，计算累加和");
        for(int i=0;i<5;i++){
            System.out.println("第"+(i+1)+"个数字：");
            numList[i]=input.nextDouble();
            sum+=numList[i];
        }
        System.out.println("5个数的和为："+sum);
        //比较5个数中的最大值
        double max=numList[0];
        for(int i=0;i<numList.length;i++){
            if(max<numList[i]){
                max=numList[i];
            }
        }
        System.out.println("5个数中max的值为"+max);

        //增强型for循环，输出数组元素
        System.out.println("\n增强型for循环输出的结果：");
        for(double n:numList){
            System.out.println(n);
        }

        //冒泡算法
        double temp=0;
        System.out.println("冒泡排序之前的结果：");
        for(double n:numList){
            System.out.print(n+"   ");
        }
        for(int i=0;i<numList.length-1;i++){
            //每一轮循环，都将产生一个最大数
            for(int j=0;j<numList.length-1-i;j++){
                if(numList[j]>numList[j+1]){
                    temp=numList[j];
                    numList[j]=numList[j+1];
                    numList[j+1]=temp;
                }
            }
        }
        //输出冒泡算法之后的结果
        System.out.println("\n输出冒泡算法之后的结果：");
        for(double n:numList){
            System.out.print(n+"   ");
        }
    }
}
