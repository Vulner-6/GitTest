package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;

public class TestSubject {
    public static void main(String[] args){
        Subject sub=new Subject();
        sub.setSubInfo("家里蹲大学","GTX666888",4);
        System.out.println(sub.getSubInfo());

        System.out.println("=================================");

        //测试学生信息
        Student stu=new Student("张三",28,"男");
        System.out.println(stu.getStuInfo());

        System.out.println("=================================");

        //测试传入对象
        System.out.println(stu.getStuInfo(sub));

    }
}
