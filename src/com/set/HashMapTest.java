package com.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 测试HashMap的使用
 * 测试添加：输入学生ID，判断是否被占用
 * 若未被占用，则输入学生姓名，创建新学生对象，并且添加到HashMap实例化对象中
 */
public class HashMapTest {
    HashMap<String,Student> hashMap1=new HashMap<String, Student>();
    HashMap hashMap2=new HashMap();
    public HashMapTest(){
        //默认构造方法
    }
    //测试map中的put方法，get方法
    public void testPut(){
        for(int i=0;i<3;i++){
            System.out.println("请输入学生ID：");
            Scanner scanner=new Scanner(System.in);
            String stuId=scanner.next();
            Student stu= hashMap1.get(stuId);
            //如果hashmap中不存在该学生id
            if(stu==null){
                //初始化一个学生对象，并设置成员属性值
                Student stuTemp=new Student();
                System.out.println("请输入学生姓名：");
                stuTemp.setName(scanner.next());
                stuTemp.setId(stuId);
                hashMap1.put(stuId,stuTemp);
            }
            //如果hashmap中存在学生id
            else{
                System.out.println("该学生ID已被占用！他是："+hashMap1.get(stuId).getId()+hashMap1.get(stuId).getName());
            }
        }
    }

    //测试keySet方法
    public void testKeySet(){
        Set<String> keySet=hashMap1.keySet();
        for(String stuId:keySet){
            String str=hashMap1.get(stuId).getName();
            System.out.println(str);
        }
    }

    //测试删除ID
    public void testRemove(){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入要删除的学生ID：");
            String stuId=scanner.next();
            Student stu=hashMap1.get(stuId);
            if(stu==null){
                System.out.println("该学生不存在，请重新输入：");
                continue;
            }
            else {
                System.out.println("目前的学生对象有：");
                for(Student s:hashMap1.values()){
                    System.out.print(s.getId()+s.getName()+"  ");
                }
                hashMap1.remove(stuId);
                System.out.println("\n删除之后有：");
                for(Student s:hashMap1.values()){
                    System.out.print(s.getId()+s.getName()+"  ");
                }
                System.out.print("\n");
                break;
            }
        }
    }

    //测试entrySet方法
    public void testEntrySet(){
        //entrySet返回map中所有键值对
        Set<Map.Entry<String,Student>> entries=hashMap1.entrySet();
        //循环输出获得的Set类型中的键值
        for(Map.Entry<String,Student> entry :entries){
            System.out.println("键："+entry.getKey()+"  值："+entry.getValue().getId()+"--"+entry.getValue().getName());
        }
    }

    //测试修改HashMap中的值
    public void testModify(){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入要修改的用户ID：");
            String stuId=scanner.next();
            Student stu=hashMap1.get(stuId);
            if(stu==null){
                System.out.println("你要修改的用户ID不存在，请重新输入");
                continue;
            }
            //若存在
            System.out.println("请输入你要设置的名字:");
            String stuName=scanner.next();
            System.out.println("当前未修改的时候，值为："+stu.getId()+stu.getName());
            Student temp=new Student(stuId,stuName);
            hashMap1.put(stuId,temp);
            System.out.println("修改完之后为："+temp.getId()+temp.getName());
            for(Student s:hashMap1.values()){
                System.out.println("目前所有的信息为："+s.getId()+s.getName()+"\n");
            }

        }

    }

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args){
        HashMapTest hashMapTest=new HashMapTest();
        hashMapTest.testPut();
        hashMapTest.testKeySet();
        hashMapTest.testRemove();
        hashMapTest.testEntrySet();
        hashMapTest.testModify();
    }
}
