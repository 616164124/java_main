package zb.算法.第一个收藏视频.删除重复数组中的重复项中的重复项;

/**
 * 数组（已进行排序过）
 *
 * @author mikael
 */
public class FirstMethod {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 6, 7, 88, 88, 99};
        System.out.println(getLength(a));
        int[] aa = {1, 2, 2, 3, 4, 6, 7, 88, 88, 99};
        System.out.println(test1(aa));
    }

    public static int getLength(int[] param) {
        int i = 0;
        for (int j = 0; j < param.length; j++) {
            if (param[j] != param[i]) {
                i++;
                param[j] = param[i];
            }
        }
        return i;
    }

    public static int test1(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                ++i;
                arr[j] = arr[i];
            }
        }
        return i;
    }

}
