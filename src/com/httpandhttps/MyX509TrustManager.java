package com.httpandhttps;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
/**
 * https的信任管理器
 * 1)需要的包都是java自带的，所以不用引入额外的包。
 * 2.)可以看到里面的方法都是空的，当方法为空是默认为所有的链接都为安全，
 *    也就是所有的链接都能够访问到。当然这样有一定的安全风险，可以根据实际需要写入内容。
 */
public class MyX509TrustManager implements X509TrustManager {
    //需要重写checkClientTrusted、checkServerTrusted、getAcceptedIssuers
    public void checkClientTrusted(X509Certificate[] chain,String authType) throws CertificateException{
            //这里为空，只是为了重写
        }



    public void checkServerTrusted(X509Certificate[] chain,String authType) throws CertificateException{

        }


    public X509Certificate[] getAcceptedIssuers(){
        return null;
    }
}
