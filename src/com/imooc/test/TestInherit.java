package com.imooc.test;
import com.imooc.inherit.*;
public class TestInherit {
    public static void main(String[] args){
        //测试猫
        Cat aCat=new Cat();
        aCat.setName("咖啡");
        aCat.setAge(11);
        aCat.setAttrName("虎纹猢狲");
        aCat.speak();
        aCat.run();

        System.out.println("================================");

        Tiger aTiger=new Tiger();
        aTiger.setName("查尔基");
        aTiger.setAge(22);
        aTiger.setKingName("印第安虎王");
        aTiger.speak();
        aTiger.killAnimal();
    }
}
