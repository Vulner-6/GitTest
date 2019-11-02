package com.httpandhttps;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

/**
 * 处理https的GET/POST请求
 * 请求地址，请求方法，请求参数
 */
public class FirstHttpsRequest {
    //设置请求头
    public static String NGFWSESSID_Value="";
    public static String httpsRequest(String requestMethod,String requestUrl,String outputStr) throws Exception{
        StringBuffer buffer=null;
        try{
            //创建SSLContext
            SSLContext sslContext=SSLContext.getInstance("SSL");
            TrustManager[] tm={new MyX509TrustManager()};
            //初始化
            sslContext.init(null, tm, new java.security.SecureRandom());
            //获取SSLSocketFactory对象
            SSLSocketFactory ssf=sslContext.getSocketFactory();
            URL url=new URL(requestUrl);
            HttpsURLConnection conn=(HttpsURLConnection)url.openConnection();
            conn.setDoOutput(true);  //允许写出
            conn.setDoInput(true);   //允许写入
            conn.setUseCaches(false);  //不使用缓存
            conn.setRequestMethod(requestMethod);

            conn.setRequestProperty("Cookie","wordpress_test_cookie=WP+Cookie+check");
            //设置当前实例使用的SSLSoctetFactory
            conn.setSSLSocketFactory(ssf);
            conn.connect();   //连接



            //往服务器端写内容
            if(null!=outputStr){
                OutputStream os=conn.getOutputStream();
                os.write(outputStr.getBytes("utf-8"));
                os.close();
            }

            //读取服务器端返回的内容
            InputStream is=conn.getInputStream();
            InputStreamReader isr=new InputStreamReader(is,"utf-8");
            BufferedReader br=new BufferedReader(isr);
            buffer=new StringBuffer();
            String line=null;
            while((line=br.readLine())!=null){
                buffer.append(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return buffer.toString();

    }

    //设置头部
    public static void setFireWallCookie(){
        System.out.println("请粘贴防火墙的NGFWSESSID字段的值：");  //NGFWSESSID
    }

}
