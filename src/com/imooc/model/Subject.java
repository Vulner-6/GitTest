package com.imooc.model;

public class Subject {
    /**
     * 学科类，包含：课程名称、课程编号、学制
     */

    private String subName;
    private String subNum;
    private int subYear;
    //统计学生报名数量的数组
    private Student[] stuArr;
    private int stuNum=0;

    //设置数组的getter  setter方法

    public Student[] getStuNum() {
        //返回数组的时候，一定要注意数组是否被创建！
        if(this.stuArr==null){
            this.stuArr=new Student[200];
        }
        return stuArr;
    }

    public void setStuNum(Student[] stuNum) {
        this.stuArr = stuNum;
    }

    //增加统计数组的方法
    public int subStuNum(){

        for(int i=0;i<=this.stuArr.length;i++){
            if(this.stuArr[i]!=null){
                this.stuNum++;
            }
            else{
                break;
            }
        }

        return this.stuNum;
    }

    //设置构造方法，防止出现不可描述的错误
    public Subject(){
        //以后有需求再编写构造方法
        System.out.println("有void修饰的构造方法无法生效");
    }

    //统一调用setter方法(用构造方法更好)
    public void setSubInfo(String name,String num,int year){
        setSubName(name);
        setSubNum(num);
        setSubYear(year);
    }

    //统一调用getter方法
    public String getSubInfo(){
        String str1,str2,str3;
        str1="课程名称："+getSubName()+"\n";
        str2="课程编号："+getSubNum()+"\n";
        str3="课程年限："+getSubYear()+"\n";
        return str1+str2+str3;
    }

    //getter and setter
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubNum() {
        return subNum;
    }

    public void setSubNum(String subNum) {
        this.subNum = subNum;
    }

    public int getSubYear() {
        return subYear;
    }

    public void setSubYear(int subYear) {
        if(subYear>=0){
            this.subYear = subYear;
        }
    }
}
