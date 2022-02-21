package com.test;


import javax.crypto.KeyGenerator;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class test001 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String sss = "123|TAX";
        System.out.println(sss);

        boolean contains = sss.contains("|TAX");
        System.out.println(contains);

        String[] split = sss.split("\\|");
        System.out.println(split[0]);
        if (1 == 1)
            System.out.println("1==1");
        System.out.println("1111");
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println(hashMap.get("AA"));

        System.out.println("==================================================");
        BigDecimal multiply = new BigDecimal("0").multiply(new BigDecimal("0.03"));
        System.out.println(multiply);
        HashMap<String, BigDecimal> hashMap1 = new HashMap<>();
        hashMap1.put("ttt", new BigDecimal(12222));
        hashMap1.put("ttt", new BigDecimal(12111));
        hashMap1.put("ttt", new BigDecimal(1222));
        hashMap1.put("ttt", new BigDecimal(133));
        hashMap1.put("ttt", new BigDecimal(13));
        System.out.println(hashMap1.get("ttt"));

        String ss = "\"{\\\"resultCode\\\":\\\"000000\\\",\\\"resultMsg\\\":\\\"接口调用成功！\\\",\\\"resultObj\\\":{\\\"cfje\\\":\\\"50\\\",\\\"nsrsbh\\\":\\\"913300007047239447\\\",\\\"swjg_dm\\\":\\\"13301063100\\\",\\\"nsrmc\\\":\\\"浙江浙科信息技术有限公司\\\",\\\"swjgmc\\\":\\\"国家税务总局杭州市西湖区税务局税源管理一科\\\"}}\"";
        String a = "1231";
        String s = "{\"fk_1\":\"" + a + "\",\"sqq\":\"" + a + "\",\"sqz\":\"" + a + "\",\"sswfxwdjuuid\":\"" + a + "\",\"sswfsddm\":\"" + a + "\",\"wfssjcfyj\":\"" + " " + "\",\"wfxwbh\",\"" + a + "\",\"wfxwmc\":\"" + a + "\",\"lyqd_dm\":\"" + a + "\"}";

        System.out.println(s);
        int c = 10;
        if ((c > 1 && c < 30) || (c > 2 && c < 22) || (c > 5 && c < 10)) {
            System.out.println(111);
        }
        ThreadLocalRandom current = ThreadLocalRandom.current();
        //[0-10]正整数的随机数，包头不包尾
        System.out.println(current.nextInt(0, 10));
        System.out.println(current);
        boolean isFlag = true;
        if (!isFlag) {
        }
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        random.nextInt(10);
        System.out.println(random.nextInt(10));

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        String name = "hsfhk";
        switch (name) {
            case "hsfhk":
                System.out.println("hsfhk");
            case "hsfh":
                System.out.println("hsfhk");
            case "hsk":
                System.out.println("hsfhk");

        }


    }

}
