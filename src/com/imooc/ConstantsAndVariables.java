package com.imooc;

public class ConstantsAndVariables {
    /*
    * 1.标识符：字母、数字、下划线、美元符组成，不能以数字开头。严格区分大小写。不能是Java关键字或保留字
    * Hello, Void, class, 123abc, _admin, abc 123
    * 2.变量命名规则：满足标识符规则、虽然变量名长度没有限制，但是尽量简单易懂、驼峰命名，如stuName
    * 3.类名：单词首字母大写、驼峰命名、与类的文件名必须一致！
    * 4.数据类型：基本数据类+引用数据类型（类、接口、数组）
    * 5.基本数据类型
    *   byte、boolean  (1)
    *   short、char   (2)
    *   int、float  (4)
    *   long、double  (8)
    * 6.八进制：0开头，最大7.如012，077
    *   十六进制：0x或0X开头，0-9，a-f或A-F。如0xaff，0X9af, 0xAF9
    * 7.长整型数的表示方式：12L,12l,0xa99L,0xae9l
    * 8.浮点型字面值默认是double类型，也可以在值后加d或D。若想表示float型，需要加f或F
    *   23.3232d, 77.33D, 8.22f, 9.22F
    * 9.字符型字面值：单引号、单个字符。如'a','b','$'。因为是字符，所以可以和数值值转换
    * 10.布尔值在Java中只能是true或false，不能像C那样，还可以0或1
    * 11.字符串：双引号引起来的0个或多个字符。
    * 12.Java可以用中文作为变量名！！！但是不建议！！！不过，我觉得可以这样写病毒免杀！！
    * 13.常量用“final+数据类型+变量名”定义，不能修改！单词全部大写，多个单词用下划线连接！
     */
    public static void main(String[] args){
        byte b=127;  //一个字节8比特，其中一位表示正负，所以8-1=7个位，只能存放小于128的数范围
        short shortNum=6666;  //存放10进制的短型数值,16-1=15位
        int octal=077;  //存放8进制数
        long longNumber=0xffffL;  //存放16进制数

        //float，double类型赋值。容器大小需要注意。
        float floatNum=123.44f;   //默认是double类型，所以这里要加f
        double doubleNum=999.9999;   //double类型的范围是最大的。

        //字符型
        char ch='a';
        char a=65;   //其实65代表的就是a字符
        char maxCh=65535;
        char outCh=(char)65536;   //超出范围需要进行强制类型转换
        char unicodeCh='\u005d';  //unicode编码

        //字符串
        String str1="hello world";
        String str2="\u005e666\u005d";  //unicode中可以夹杂非unicode的字符
        System.out.println("联合输出："+str1+str2);

        //科学计数法表示
        double doubleNum2=12e5d;  //表示12*10的5次方.e和E都可以
        float floatNum2=5E2f;    //表示5*10*10
        double specialNum=.2;   //表示double类型0.2

        //数据类型转换、丢失问题
        float f1=123456789L;
        System.out.println("float存long类型："+f1);   //输出后发现数据精度改变

        //常量
        final double PI=3.14;   //可以省略d
        final double MY_VALUE=13.14;


    }
}
