package JUC.com.jvmtest.runtime;

public class ViewCPU {
  public static void main(String[] args) {
    int i = Runtime.getRuntime().availableProcessors();
    long l = Runtime.getRuntime().freeMemory(); // 剩余内存
    long max = Runtime.getRuntime().maxMemory(); // 最大内存
    long total = Runtime.getRuntime().totalMemory(); // 总共内存
    System.out.println(
        "cpu个数\t" + i + "\t" + "剩余内存\t" + l + "\t\t" + "最大内存\t" + max + "\t\t" + "总共内存\t" + total);
  }
}
