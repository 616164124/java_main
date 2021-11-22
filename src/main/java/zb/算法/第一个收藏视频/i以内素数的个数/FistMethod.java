package zb.算法.第一个收藏视频.i以内素数的个数;

/**
 * 100以内的素数个数为25个
 * @author mikael
 */
public class FistMethod {
    public static void main(String[] args) {

        int i = countPrime(100);
        System.out.println("素数的个数：\t"+i);

    }

    private static int countPrime(int range) {
       int count=0;
        for (int i1 = 2; i1 < range; i1++) {
            count+=findPrime(i1)?1:0;
        }
        return count;
    }
    public static boolean findPrime(int x){
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
