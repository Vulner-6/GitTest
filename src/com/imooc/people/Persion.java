package com.imooc.people;

public class Persion {
    private int age=12;
    private String name;

    public Persion(){
        //默认无参构造方法
    }

    public void eat(){
        System.out.println("外部吃东西");
    }

    //获取成员内部类
    public Heart getHeart(){
        return new Heart();
    }

    /**
     * 成员内部类。若不加public 修饰，那么默认可以使用的范围是同一个包内
     * 注意事项：
     * 1.内部类如果想被外部类调用，那么只能先在外部类中实例化内部类，才能调用内部类的成员
     * 2.内部类的访问修饰符可以随意，但是使用范围会收到限制
     * 3.内部类可以直接访问外部类成员，如果有命名冲突，优先使用内部类成员
     * 4.若想在内部类中使用外部类成员，规则为：外部类名.this.外部成员名
     * 5.内部类实例化，只能通过外部类先实例化。
     * 6.内部类编译后，名为：  外部类$内部类.class
     * 7.
     */
    public class Heart{
        private int age=33;
        public void beat(){
            eat();
            System.out.println(age+"心脏在跳动"+Persion.this.age);
        }
        public void eat(){
            System.out.println("内部吃东西方法");
        }
    }


    //getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
