package com.study.exception;

import java.util.Scanner;

/**
 * 1.获取用户输入，选择查找类型
 * 判断用户输入类型，×按名称查找  ×按序号查找：
 *
 */
public class ProjectBook {
    public static void main(String[] args){
        //存在的书籍
        String[] books={"编程","汇编","Java"};
        Scanner scanner=new Scanner(System.in);
        int index;
        String book;
        //循环判断用户输入
        while(true){
            System.out.println("输入数字：1.按名称查找   2.按序号查找");
            try{
                index=getInput();
                switch (index){
                    case 1:
                        //根据名称查找
                        book=findByName(books);
                        System.out.println("书籍存在："+book);
                        break;
                    case 2:
                        //按序号查找
                        book=findByNumber(books);
                        System.out.println("书籍存在："+book);
                        break;
                    case -1:
                        //没有在范围内或没有说输入数字
                        System.out.println("请输入选项数字！");
                        continue;
                    default:
                        //未知错误，请重新输入
                        System.out.println("未知错误，请重新输入");
                        continue;
                }
                break;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }


        }

    }

    /**
     * 限定用户输入只能是整数！但是整数可能超出选项范围，后面使用的时候要注意。
     */
    public static int getInput() throws Exception{
        Scanner scanner=new Scanner(System.in);
        int index;
        while (true){
            System.out.println("请输入要选择的方式：");
            try{
                index=scanner.nextInt();
                return index;
            }
            catch (Exception e){
                return -1;
            }
        }
    }

    /**
     * 根据名称查找
     */
    public static String findByName(String[] books) throws Exception{
        Scanner scanner=new Scanner(System.in);
        String bookName;
        while(true){
            System.out.println("请输入书名：");
            bookName=scanner.next();
            for(int i=0;i<books.length;i++){
                if(bookName.equals(books[i])){
                    return books[i];
                }
            }
            //System.out.println("没有找到名为"+bookName+"的书籍");
            throw new Exception("没有找到书籍");
        }
    }

    /**
     * 根据序号查找
     */
    public static String findByNumber(String[] books) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int index;
        while (true){
            try {
                System.out.println("请输入要查找的序号：");
                index=scanner.nextInt();
                if(index>3||index<=0){
                    System.out.println("超出范围，图书不存在");
                    continue;
                }
                String bookName=books[index-1];
                return bookName;
            }catch (ArrayIndexOutOfBoundsException e){
                Exception bookNotExist=new Exception("请输入整数！");
                bookNotExist.initCause(e);
                throw bookNotExist;
            }
        }
    }
}
