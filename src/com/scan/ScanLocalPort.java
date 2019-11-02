package com.scan;

import java.net.Socket;

public class ScanLocalPort {
    public static void main(String[] args){
        BeginScan beginScan=new BeginScan();

            beginScan.scan();



    }
}


class BeginScan{
    public void scan(){
        for(int i=1;i<=65535;i++){
            try{
                Socket socket=new Socket("127.0.0.1",i);
                System.out.println("开放端口："+i);
                socket.close();
            }
            catch (Exception e){
                System.out.println("关闭："+i);
            }finally {
                continue;
            }



        }
    }
}
