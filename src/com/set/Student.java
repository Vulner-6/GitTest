package com.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class Student {
    private String name;
    private String id;
    public Set courses;

    //默认无参构造方法
    public Student(){

    }
    public Student(String name,String id){
        this.setId(id);
        this.setName(name);
        //创建一个set容器
        this.courses=new HashSet();
    }

    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
