package com.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 泛化类
 * 设置了泛型，那么只能在指定的列表中添加一种类型或者这种类型子类型的元素
 */
public class Genertic {
    List<Course> courseList;
    Course[] courses={
            new Course("1","科目一"),
            new Course("2","科目二"),
            new Course("3","科目三"),
    };
    //默认构造方法
    public Genertic(){
        this.courseList=new ArrayList<Course>();
    }

    //测试添加方法
    public void testAdd(){
        this.courseList.addAll(Arrays.asList(courses));
    }

    //测试迭代器输出List中的元素
    public void testOutput(){
        Iterator it=this.courseList.iterator();
        Course temp;
        while(it.hasNext()){
            temp=(Course) it.next();
            System.out.println(temp.getId()+temp.getName());
        }
    }

    //测试foreach输出泛型列表的方法
    public void testForEach(List<Course> courses){
        for(Course co:courses){
            System.out.println(co.getId()+co.getName());
        }
    }

    /**
     * 程序入口
     */
    public static void main(String[] args){
        Genertic genertic=new Genertic();
        genertic.testAdd();
        genertic.testOutput();
        genertic.testForEach(genertic.courseList);
    }

}


