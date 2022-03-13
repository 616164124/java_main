package zb.算法.test;

import java.math.BigDecimal;

public class Test03 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("100");
        BigDecimal add = bigDecimal.add(new BigDecimal("-80"));
        System.out.println(add.toString());
    }
}
