package com.imooc;

public class ArrayKnowledgeTwo {
    /*
    * 1.创建二维数组
    *   int[][] arrTwo=new int[2][3];    //两行三列二维数组
    * 2.给二维数组赋值
    *   int[][] arrTwo={{123},{456}};  //创建的时候就初始化
    *   或者利用双重循环给每个元素赋值
    * 3.输出二维数组
    *   双重循环输出
    * 4.特殊的二维数组声明
    *   int[][] arrTwo=new int[3][];  //可以先只声明行数
    *   arrTwo[0]=new int[4];   //对每一行逐个声明列数
    *   arrTwo[1]=new int[5];   //并且声明的列数还可以不同
    *   arrTwo[2]=new int[6];
    *
     */
    public static void main(String[] args){
        //声明三个数组，用三种方式
        int[][] arr1=new int[3][3];   //三行三列数组，未填写元素
        int[][] arr2={{123},{456},{789}};   //三行三列数组，创建的时候就初始化
        int[][] arr3=new int[3][];
        arr3[0]=new int[3];
        arr3[1]=new int[4];
        arr3[2]=new int[5];
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                arr3[i][j]=j;
            }
        }
        //双重循环输出
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }
}
