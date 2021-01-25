package JUC.com.jdk8;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * 根据jdk8自带端base64进行加密，解密 注意：不同的base64不能混用
 *
 * <p>作用：网络传输 重点 不可见性 （容易破解）
 */
// https://blog.csdn.net/qq_42402854/article/details/99849284
public class Base64EncryptionAndDecryption {
  public static void main(String[] args) throws UnsupportedEncodingException {
    //
    String str = "hello,base64 !''\t \n" + "ABCD";
    // 加密
    String string = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
    System.out.println("加密后 \t" + string);
    // 解密
    String s = new String(Base64.getDecoder().decode(string), StandardCharsets.UTF_8);
    System.out.println("解密 \t " + s);
  }
}
