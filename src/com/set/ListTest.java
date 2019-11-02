package com.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 存放课程的list类
 */
public class ListTest {
    //创建一个List容器
    public List coursesToSelect;

    //默认构造方法
    public ListTest(){
        this.coursesToSelect=new ArrayList();
    }

    public void testAdd(){
        Course course=new Course("TX01","课程1");
        //增加的必须是实例化过的对象
        this.coursesToSelect.add(course);
        Course test=(Course) coursesToSelect.get(0);
        System.out.println("名字是："+test.getName()+"\nid是："+test.getId());
        Course temp=new Course("Tx02","课程2");
        this.coursesToSelect.add(0,temp);
        System.out.println("添加过之后的0位置为："+((Course) coursesToSelect.get(0)).getName());

        //对象数组中的对象元素，添加到List中
        Course[] courses={new Course("3","汇编语言"),new Course("4","离散数学")};
        coursesToSelect.addAll(Arrays.asList(courses)); //将数组元素转换成list集合，并全部添加
        //迭代器输出列表所有元素
        Iterator it=coursesToSelect.iterator();
        int index=0;
        while (it.hasNext()){
            Course temp2=(Course) it.next();
            System.out.println("不强制转换就会导致迭代器输出的是内存地址\n"+it.next());
            System.out.println("id是："+temp2.getId()+"名字是："+temp2.getName());
        }
    }

    /**
     * 测试利用循环的方法，重新输出List中的元素
     */
    public void testGet(){
        Course[] courses={
                new Course("1","Java"),
                new Course("2","Python"),
                new Course("3","C++"),
        };
        List courseList=new ArrayList();
        courseList.addAll(Arrays.asList(courses));
        for(int i=0;i<courseList.size();i++){
            Course temp=(Course) courseList.get(i);
            System.out.println(temp.getId()+temp.getName());
        }
        System.out.println("================================");
        //利用foreach再打印输出看看
        for (Object obj:courseList) {
            Course cr=(Course)obj;
            System.out.println(cr.getId()+cr.getName());
        }
    }

    /**
     * 测试修改和删除List中元素
     *
     */
    public void testModify(){
        List courseList=new ArrayList();
        Course temp=new Course("3","net");
        courseList.add(temp);
        Course[] course={new Course("1","java"),new Course("2","python")};
        courseList.addAll(Arrays.asList(course));

        courseList.set(1,new Course("666","set(php)"));
        Iterator it=courseList.iterator();
        /*
        * 牢记：使用Iterator.next()的时候，需要用个变量来接，否则会报异常！
        * */
        while (it.hasNext()){
            try{
                //必须这么写，否则异常！
                Course tempTest=(Course)it.next();
                System.out.println(tempTest.getId()+tempTest.getName());
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("异常消息："+e.getMessage());
            }
            System.out.println("length="+courseList.size());
        }
    }

    //主函数入口
    public static void main(String[] args){
        ListTest lt=new ListTest();
        lt.testAdd();
        System.out.println("================================");
        lt.testGet();
        System.out.println("================================");
        lt.testModify();
    }
}
