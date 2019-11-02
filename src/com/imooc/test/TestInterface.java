package com.imooc.test;

import com.imooc.telphone.Camera;
import com.imooc.telphone.FourthPhone;
import com.imooc.telphone.InterfacePhoto;
import com.imooc.telphone.SelectInterface;

public class TestInterface {
    public static void main(String[] args){
        InterfacePhoto ip=new FourthPhone();
        ip.photo();
        //必须强制类型转换，向下转型才能使用第四代手机的游戏功能
        ((FourthPhone) ip).game();
        InterfacePhoto ip2=new Camera();
        ip2.photo();

        System.out.println("==========================");

        /**
         * 接口中的成员属性变化
         */
        FourthPhone fourthTest=new FourthPhone();
        System.out.println("接口中的属性"+ip.TEMP);    //20
        System.out.println("接口中的属性"+((FourthPhone) ip).TEMP);  //30
        System.out.println("接口中的属性"+InterfacePhoto.TEMP);  //20
        System.out.println("接口中的属性"+fourthTest.TEMP);    //30

        System.out.println("==================================");

        ip.connect();
        InterfacePhoto.stop();

        System.out.println("==================================");

        SelectInterface test1=new SelectInterface();
        test1.connect();



    }
}
