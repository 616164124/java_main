package zb.算法.第一个收藏视频.i以内素数的个数;

/**
 * 采用埃筛法
 *
 * @author mikael
 */
public class SecondMethod {
    public static void main(String[] args) {
        int count = count(100);
        System.out.println(count);
    }

    //素数 非素数（合数）  12=2*6
    public static int count(int range) {
        boolean[] isPrime = new boolean[range];//false 为素数
        int count = 0;
        for (int i = 2; i < range; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i * i; j < range; j++) {
                    isPrime[j] = true;
                }
            }
        }

        return count;
    }
}
