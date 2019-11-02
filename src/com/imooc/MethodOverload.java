package com.imooc;

public class MethodOverload {
    /*
    * 1.方法重载判断依据：
    *   方法名相同，但是方法参数不同
    * 2.基本数据类型和引用数据类型向方法中传参的时候，影响不同
    *   基本数据类型：方法不会对主方法中的变量值造成影响
    *   引用数据类型：由于变量指向内存地址，因此传给方法的是内存地址，方法改变内存地址中存储的值，主方法也会受到影响
     */
    public static void main(String[] args){
        MethodOverload test=new MethodOverload();
        //方法重载：整型数的和
        int result1=test.sum(1,2);
        System.out.println("整型方法的和：1+2="+result1);
        //方法重载，double型数的和
        double result2=test.sum(1.1,2.2);
        System.out.println("double类型的和：1.1+2.2="+result2);
        //方法重载，传入double数组
        double[] arr={1.1,2.2,3.3};
        result2=test.sum(arr);
        System.out.println("数组的和：1.1+2.2+3.3="+result2);

        //引用数据类型——主方法中数组会被方法影响
        System.out.println("*************************");
        System.out.println("引用数据类型向方法传参的影响");
        System.out.println("*************************");

        int[] testArr={1,2,3,4,5};
        System.out.print("主方法，方法前：");
        for(int n:testArr){
            System.out.print(n+"  ");
        }
        //方法中
        test.modifyArr(testArr);
        //方法后
        System.out.print("主方法，方法后：");
        for(int n:testArr){
            System.out.print(n+"  ");
        }

    }

    //声明求和方法
    public int sum(int num1,int num2){
        return num1+num2;
    }
    public double sum(double num1,double num2){
        return num1+num2;
    }
    public double sum(double[] numArr){
        double sumArr=0;
        for(int i=0;i<numArr.length;i++){
            sumArr+=numArr[i];
        }
        return  sumArr;
    }

    //声明一个修改数组中第一个值的方法
    public void modifyArr(int[] arr){
        arr[0]=999;
        System.out.print("方法中：");
        for(int n:arr){
            System.out.print(n+"  ");
        }
    }
}
