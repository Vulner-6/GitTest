package com.httpandhttps;

import java.util.Scanner;

public class FireWallBan {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入防火墙NGFWSESSID字段的值：");
        FirstHttpsRequest.NGFWSESSID_Value=scanner.next();
        System.out.println("开始封禁IP（退出程序请输入end）----------------------------");

    }
}
