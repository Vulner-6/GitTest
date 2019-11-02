package com.imooc.telphone;

/**
 * 原始手机
 */
public class Telphone {
    private String brand;
    private double price;

    public Telphone(){

    }

    public void call(){
        System.out.println("可以打电话");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
