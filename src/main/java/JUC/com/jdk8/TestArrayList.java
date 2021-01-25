package JUC.com.jdk8;

import java.util.Arrays;
import java.util.List;

public class TestArrayList {
  public static void main(String[] args) {
    //
    int[] a = {1, 2, 3, 4, 5};
    Integer[] b = {1, 2, 3, 4, 5};
    Integer[] b1 = {1, 2, 3, 4, 5};
    String[] c = {"1", "2", "3", "4", "5"};
    List ints = Arrays.asList(a);
    List integers = Arrays.asList(b);
    List integers1 = Arrays.asList(b1);
    List<String> strings = Arrays.asList(c);
    //  8种基本类型不能泛型化
    System.out.println(ints.size()); // 为 1
    System.out.println(integers.size()); // 为 5
    System.out.println(strings.size()); // 为 5
    integers1.addAll(integers);
    System.out.println(integers1.size());
  }
}
