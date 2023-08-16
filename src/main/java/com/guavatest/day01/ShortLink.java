package com.guavatest.day01;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.UUID;

/**
 * 生成短链
 */
public class ShortLink {

    public String bloom(String longUrl) {
        //将长url转换为短url
        String to62url = to62url(longUrl);
        return to62url;
    }

    //将长url转换为短url
    public String to62url(String longUrl) {
        //MurmurHash算法
        HashFunction function = Hashing.murmur3_32();
        HashCode hashCode = function.hashString(longUrl, Charset.forName("utf-8"));
        //i为长url的murmur值
        int i = Math.abs(hashCode.asInt());
        //准备一个url在生成的murmur值重复时拼接字符串用
        String newurl = longUrl;
        //bo如果为true说明布隆过滤器中已存在
//        boolean bo = bloomFilter.mightContain(i);
//        while (bo) {
//            newurl += "ALREADY";
//            hashCode = function.hashString(newurl, Charset.forName("utf-8"));
//            //使用拼接过字符串的url重新生成murmur值
//            i = Math.abs(hashCode.asInt());
//            bo = bloomFilter.mightContain(i);
//        }
//        //将murmur值放入布隆过滤器
//        bloomFilter.put(i);
        //转成62进制位数更短
        String to62url = encode(i);
        function = null;
        hashCode = null;
        return to62url;
    }

    //将目标转换为62进制 位数更短
    public String encode(long num) {
        String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int scale = 62;
        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        while (num > scale - 1) {
            remainder = Long.valueOf(num % scale).intValue();
            sb.append(chars.charAt(remainder));
            num = num / scale;
        }
        sb.append(chars.charAt(Long.valueOf(num).intValue()));
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ShortLink shortLink = new ShortLink();
        System.out.println(shortLink.bloom("https://www.csdn.net/tags/MtTaEg0zYmxvZwO0O0OO0O0O121hfkjdhkjashfuiehjkzfhuekhfkshf/kjfiwehfjhkjgkjlajfl"));
        String ss = "https://www.csdn.net/tags/MtTaEg0zAALREADYALREADYALREADYALREADY";
        System.out.println(ss.replaceAll("ALREADY", ""));
        HashSet<String> strings = new HashSet<>();
        try {
            for (int i = 0; i < 1000000; i++) {
                String uuid = UUID.randomUUID().toString().replace("-", "");
                strings.add(shortLink.bloom(uuid));
                System.out.println(uuid);
            }
        } catch (Exception e) {
            System.out.println("11111111111111");

        }

    }


}