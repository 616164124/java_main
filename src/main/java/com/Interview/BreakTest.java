package com.Interview;

import java.util.HashMap;

/**
 * @author mikael
 */
public class BreakTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 88) {
                System.out.println("i\t" + i);
                break;
            }
            HashMap hashMap = new HashMap(12);

            if (i > 79) {
                System.out.println(i);
            }
        }
    }
}
