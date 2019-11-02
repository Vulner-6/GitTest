package com.set;

/**
 * 课程类
 */
public class Course {
    private String id;
    private String name;

    /**
     * 重写equals方法
     */
    public boolean equals(Object obj){
        //如果当前Course对象与形参相等(相当于内存地址相同)
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        //如果obj不是Course实例
        if(!(obj instanceof Course)){
            return false;
        }
        Course course=(Course)obj;
        //如果名称为空
        if(this.getName()==null){
            if(course.getName()==null){
                return true;
            }
            else{
                return false;
            }
        }
        //如果名称不为空
        else {
            if(this.getName().equals(course.getName())){
                return true;
            }
            else {
                return false;
            }
        }

    }

    //默认构造方法
    public Course(){

    }
    //传参构造方法
    public Course(String id,String name){
        setId(id);
        setName(name);
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
