package com.httpandhttps;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 提供stringToStream()字符串转输入流方法
 * 提供streamToString()输入流转字符串方法
 */

public class StringStream {
    //将字符串转为输入流的方法
    public static InputStream stringToStream(String sInputString) {
        //判断传入的sInputString字符串一定不为空，才执行下面代码
        if(sInputString!=null && !sInputString.trim().equals("")){
            try{
                ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(sInputString.getBytes());
                return byteArrayInputStream;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        //如果传入的字符串为空，就返回null
        return null;
    }

    //将输入流转换为字符串的方法
    public static String streamToString(InputStream inputStream) throws Exception{
        if(inputStream!=null){
            try{
                //将输入流转换成可以读取的对象
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
                //声明一个字符串缓存对象
                StringBuffer stringBuffer=new StringBuffer();
                //声明一个临时存储一行数据的字符串
                String strTempLine=new String("");
                //一直读取输入流中的数据，直到没有为止
                while ((strTempLine=bufferedReader.readLine())!=null){
                    stringBuffer.append(strTempLine);
                }
                //读取结束后，返回字符串
                return stringBuffer.toString();
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        //如果输入流为空，就返回空
        return null;
    }
}
