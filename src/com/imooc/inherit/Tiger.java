package com.imooc.inherit;

public class Tiger extends Animal {
    public Tiger(){
        System.out.println(this.getName()+"在“吼吼～”叫");
    }
    private String kingName;
    public void setKingName(String kingName){
        this.kingName=kingName;
    }
    public String getKingName(){
        return this.kingName;
    }

    //老虎的独特方法，可以捕猎
    public void killAnimal(){
        System.out.println(this.getAge()+"个月大的"+this.getName()+"杀死了一只野猪！");
    }
}
