package com.guavatest.day01;

import com.google.common.hash.Hashing;

import java.math.BigInteger;
import java.util.concurrent.atomic.LongAdder;

/**
 * 采用murmur3_32来实现短连接的生产
 *
 * @author mikael
 */
public class Murmur32_Hash {
  private static final String ALPHABETS =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
  private static final int BASE = ALPHABETS.length();

  public static void main(String[] args) {
    String url = "https://blog.csdn.net/weixin_33795093";
    Murmur32_Hash test2 = new Murmur32_Hash();
    System.out.println(test2.shortenUrl(url));
    System.out.println(BASE);
    System.out.println("九五至尊，天下首富====》" + "九五至尊，天下首富".hashCode()); //  -576041546

    // ***************
    BigInteger bigInteger = new BigInteger("123");
    BigInteger[] bigIntegers = bigInteger.divideAndRemainder(new BigInteger("12"));
    System.out.println(bigIntegers[0]);
    LongAdder longAdder = new LongAdder();
  }

  /**
   * 生产短连接码
   *
   * @param url
   * @return
   */
  public String shortenUrl(String url) {
    long murmur32 = Hashing.murmur3_32().hashUnencodedChars(url).padToLong();
    System.out.println(Long.MAX_VALUE);
    System.out.println(murmur32);
    // murmur32 = 123123131333333L;
    murmur32 = 576041546;
    String encoded;
    encoded = encode(murmur32);
    return encoded;
  }

  private String encode(long oct) {
    BigInteger octLong = BigInteger.valueOf(oct);
    StringBuilder builder = new StringBuilder(6);
    System.out.println(BigInteger.ZERO);
    while (!octLong.equals(BigInteger.ZERO)) {
      BigInteger[] divideAndReminder = octLong.divideAndRemainder(BigInteger.valueOf(BASE));
      builder.append(ALPHABETS.charAt(divideAndReminder[1].intValue()));
      octLong = divideAndReminder[0];
    }
    return builder.reverse().toString();
  }
}
