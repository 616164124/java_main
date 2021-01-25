package JUC.com.jdk8.jdk8day0041;

import java.util.HashMap;

public class TestHahsMap {
  public static void main(String[] args) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(12344, "fls");

    int a = 100;
    int i = a & (4 - 1);
    int b = 100 % 4;
    System.out.println(i + "\t" + b);
  }
}
