package com.imooc.model;

public class Student {
    private String stuName;
    private int stuAge;
    private String stuSex;

    //构造方法
    public Student(){
        //默认构造方法，什么也不做
    }
    public Student(String name,int age,String sex){
        //多重构造方法，初始化学生信息
        setStuName(name);
        setStuAge(age);
        setStuSex(sex);
    }

    /**
     * 获取学生信息
     * @return
     */
    public String getStuInfo(){
        return "学生姓名："+getStuName()+"\n学生年龄："+getStuAge()+"\n学生性别："+getStuSex();
    }
    //方法的重载
    public String getStuInfo(Subject sub){
        return "学生姓名："+getStuName()+"\n学生年龄："+getStuAge()+"\n学生性别："+getStuSex()+"\n所学专业："+sub.getSubName()+"\n专业编号："+sub.getSubNum();
    }

    //getter和setter
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        if(stuAge<=100&&stuAge>=18){
            this.stuAge = stuAge;
        }
        else{
            this.stuAge=18;
        }
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        if(stuSex=="女"){
            this.stuSex = stuSex;
        }
        else {
            this.stuSex="男";
        }

    }
}
