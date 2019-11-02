package com.set;

import java.util.*;

/**
 * 测试List,Set,Map中的contains方法，解决常见问题
 */
public class TestContains {
    //课程列表-List
    public List<Course> courseList=new ArrayList<Course>();
    public Course[] courses={
            new Course("1","课程1"),
            new Course("2","课程2"),
            new Course("3","课程3"),
    };
    //List中添加对象
    public void listAdd(){
        courseList.addAll(Arrays.asList(courses));
    }
    //判断List中课程是否存在
    public void exitsCourse(){
        Course tempC=new Course("1","课程1");
        if (courseList.contains(tempC)) {
            System.out.println("list中存在课程1(已在Course中重写equals类)");
        }
        else{
            System.out.println("list中不存在课程1(已在Course中重写equals类)");
        }

    }
    //找到List中存在的元素的下标
    public void indexOfList(){
        Course temp=new Course("3","课程3");
        if(courseList.contains(temp)){
            System.out.println(temp.getName()+"存在,其下标位置为："+courseList.indexOf(temp));
        }
    }
    //课程列表Set
    Set<Course> courseSet=new HashSet<Course>();
    //生成Set列表
    public void setAdd(){
        courseSet.addAll(Arrays.asList(courses));
    }
    //判断Set中课程是否存在
    public void setExistsCourse(){
        Course tempS=new Course("2","课程2");
        if(courseSet.contains(tempS)){
            System.out.println(tempS.getId()+tempS.getName()+"存在");
        }
        else{
            System.out.println(tempS.getName()+"不存在");
        }
    }

    //判断map中是否存在key-value值
    HashMap<String,Course> hashMap=new HashMap<String, Course>();
    //添加hashmap的键值对
    public void hashMapAdd(){
        for(Course ct:courseList){
            hashMap.put(ct.getId(),ct);
        }
    }
    //查询某个key或某个value是否存在
    public void hashMapSearch(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要在hashMap中查询的id：");
        String id=scanner.next();
        if(hashMap.containsKey(id)){
            System.out.println("包含！他的值是："+hashMap.get(id).getId()+hashMap.get(id).getName());
        }
        else {
            System.out.println("不包含"+id);
        }
        System.out.println("请输入在hashmap中要查询的value值：");
        String name=scanner.next();
        for(Course ct:hashMap.values()){
            if(name.equals(ct.getName())){
                System.out.println("存在名为"+ct.getName()+"的对象");
            }

        }
        System.out.println("不存在名为"+name+"的对象");




    }
    //默认构造方法
    public TestContains(){

    }
    //程序入口
    public static void main(String[] args){
        TestContains testContains=new TestContains();
        testContains.listAdd();
        testContains.exitsCourse();
        testContains.setAdd();
        testContains.setExistsCourse();
        testContains.indexOfList();
        testContains.hashMapAdd();
        testContains.hashMapSearch();
    }
}
