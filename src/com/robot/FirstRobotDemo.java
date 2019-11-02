package com.robot;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.awt.event.KeyEvent;

public class FirstRobotDemo {
    public static void main(String[] args) throws AWTException, IOException,InterruptedException {
        //运行打开windows记事本的命令
        Runtime runtime=Runtime.getRuntime();
        String command="notepad.exe";
        runtime.exec(command);

        //声明Robot对象，输入按键hh
        Robot robot=new Robot();
        for(int i=0;i<2;i++){
            robot.keyPress(KeyEvent.VK_H);  //模拟按键h
            Thread.sleep(1000);
        }

        //测试编写的方法
        FirstRobotDemo firstRobotDemo=new FirstRobotDemo();
        firstRobotDemo.callWeChat(robot);  //调出微信消息框
        firstRobotDemo.mouseLeftClick(robot,218,195,1);
        Thread.sleep(2000);
        firstRobotDemo.keyPressString(robot,"Java test send message",544,640);


    }

    /**
     * 使用ctrl+alt+z调出QQ消息界面（必须先登录QQ）
     * @throws AWTException
     */
    public void callQQ(Robot robot) throws AWTException{
        //ctrl+alt+z  同时按
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_Z);
        robot.keyRelease(KeyEvent.VK_CONTROL);  //应该是放开按键
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_Z);

    }

    /**
     * 使用ctrl+alt+w调出微信界面(必须先登录微信)
     */
    public void callWeChat(Robot robot) throws AWTException{
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_W);
    }

    /**
     * 鼠标点击，需要传入坐标 int x,int y
     */
    public void mouseLeftClick(Robot robot,int x,int y,int num) throws AWTException,InterruptedException{
        //测试鼠标的移动，点击
        robot.mouseMove(x,y);
        for(int i=1;i<=num;i++){
            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(20);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            Thread.sleep(500);
        }
    }

    /**
     * 在剪切板中添加要输出的字符串
     */
    public void keyPressString(Robot robot,String str,int x,int y) throws AWTException,InterruptedException{
        //获取剪切板
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        //封装传入的字符串
        Transferable tText=new StringSelection(str);
        //将字符串放入剪切板
        clipboard.setContents(tText,null);
        //按下ctrl+v实现粘贴
        mouseLeftClick(robot,x,y,1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(200);
        //模拟回车键，进行发送
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(100);
    }
}
