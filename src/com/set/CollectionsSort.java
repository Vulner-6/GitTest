package com.set;

import java.util.*;

/**
 * 学习集合的排序方法
 */
public class CollectionsSort {
    public List<Integer> integers=new ArrayList<Integer>();

    /**
     * 随机在List中添加整数，
     */
    public void randomAdd(){
        Random random=new Random();
        Integer integer=new Integer(100);
        for(int i=0;i<10;i++){
            //判断列表中是否已经存在这个随机值
            do{
                //随机生成100以内的数
                integer=random.nextInt(100);
            }while (integers.contains(integer));
            integers.add(integer);
        }
        System.out.println("--------------排序前-----------------");
        for(Integer i:integers){
            System.out.print(i+"  ");
        }
        System.out.println("\n--------------排序后-----------------");
        Collections.sort(integers);
        for(Integer i:integers){
            System.out.print(i+"  ");
        }
        System.out.println("");
    }
    public List<String> strings=new ArrayList<>();
    /**
     * 测试List中的字符串排序
     */
    public void strCollectionsSort(){

        String[] stringsTemp={"best1","aest2","test3"};
        strings.addAll(Arrays.asList(stringsTemp));
        System.out.println("-----------------排序前--------------");
        for(String str:strings){
            System.out.print(str+"  ");
        }
        System.out.println("\n--------------排序后-----------------");
        Collections.sort(strings);
        for(String str:strings){
            System.out.print(str+"  ");
        }
    }

    /**
     * 生成指定长度的随机字符串[min,max)，并输出
     */
    public void randomStr(int min,int max,int arrs){
        //a-z是97-122    A-Z是65-90   0-9是48-57
        Random random=new Random();
        String strResult=new String();
        int stop=0;
        while (stop<3){
            //当生成固定长度的时候
            if(min==max){
                for(int i=0;i<min;i++){
                    //每次循环的时候，都随机生成一个字母
                    this.randomOutput();
                }
            }
            //当生成一定范围内长度的时候
            if(min<max){
                //for循环代表每次生成字符串的长度
                for(int i=0;i<random.nextInt(max-min)+min;i++){
                    this.randomOutput();
                }
            }
            System.out.print("  ");
            //循环5次跳出(也就是生成5组字符串)
            stop+=1;
            if(stop==5){
                break;
            }

        }
    }

    /**
     * 大小写字母，数字，随机输出一个
     */
    public void randomOutput(){
        Random random=new Random();
        Integer smallWord=random.nextInt(26)+97;
        Integer bigWord=random.nextInt(26)+65;
        Integer num=random.nextInt(10)+48;
        Integer index=random.nextInt(3);
        Integer[] integers={smallWord,bigWord,num};
        System.out.print((char) (integers[index].intValue()));
    }

    /**
     * 程序入口
     */
    public static void main(String[] args){
        CollectionsSort collectionsSort=new CollectionsSort();
        collectionsSort.randomAdd();
        collectionsSort.strCollectionsSort();
        System.out.print("\n");
        collectionsSort.randomStr(3,6,3);
    }
}
