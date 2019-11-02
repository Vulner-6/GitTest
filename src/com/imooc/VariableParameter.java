package com.imooc;

public class VariableParameter {
    /*
    * 1.可变参数必须写在形参后面，例如：
    *   public void sum(int a,int... b)
    * 2.可以把数组传递给可变参数列表，例如：
    *   int[] arr={1,2,3};
    *   public void sum(int a,int... b)   //可以给b
    * 3.一旦定义了可变参数，那么进行方法重载的时候，如果定义数组，那么就会报错
    * 4.数组作为参数时，是不能将多个值传递给数组的
     */
    public static void main(String[] args){
        VariableParameter test=new VariableParameter();
        int[] arr={1,2,3,4,5,5};
        test.search(5,arr);
    }
    //自定义找出数组中指定值的方法
    public void search(int target,int... scope){
        for(int n:scope){
            if(target==n){
                System.out.println("数组中存在"+target);
                break;
            }

        }
    }
}
