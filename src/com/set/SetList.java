package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试Set
 * set特点：无序，无重复值
 */
public class SetList {
    Set<Course> courseSet=new HashSet<Course>();
    public SetList(){
        //默认无参构造方法。如果没有，只写了默认有参构造方法，那么可能会无法被继承
    }
    //测试添加set中的元素
    public void testAdd(){
        this.courseSet.add(new Course("1","project1"));
        this.courseSet.add(new Course("2","project2"));
        this.courseSet.add(new Course("3","project3"));
        this.courseSet.add(new Course("1","project1"));
    }
    //测试打印输出
    public void testOutput(){
        Iterator<Course> it=this.courseSet.iterator();
        while (it.hasNext()){
            Course temp=it.next();
            System.out.println(temp.getId()+temp.getName());
        }
    }
    /**
     * 程序入口方法
     */
    public static void main(String[] args){
        SetList setList=new SetList();
        setList.testAdd();
        setList.testOutput();
    }

}
