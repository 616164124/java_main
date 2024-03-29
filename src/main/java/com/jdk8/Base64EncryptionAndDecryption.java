package com.jdk8;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

/**
 * 根据jdk8自带端base64进行加密，解密 注意：不同的base64不能混用
 *
 * <p>作用：网络传输 重点 不可见性 （容易破解）
 */
// https://blog.csdn.net/qq_42402854/article/details/99849284
//  https://www.cnblogs.com/zhuyeshen/p/11424713.html
//java各种加密方式
//https://blog.csdn.net/theUncle/article/details/100156976

public class Base64EncryptionAndDecryption {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //
        String str = "hello,base64 !''\t \n" + "ABCD";
        // 加密
        String string = Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
        System.out.println("加密后 \t" + string);
        // 解密
        String s = new String(Base64.getDecoder().decode(string), StandardCharsets.UTF_8);
        System.out.println("解密 \t " + s);

    }

    public static final String KEY_MD5 = "MD5";

    /***
     * MD5加密（生成唯一的MD5值）
     * @param data
     * @return
     * @throws Exception
     */
    public static byte[] encryMD5(byte[] data) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
        md5.update(data);
        return md5.digest();
    }


}
