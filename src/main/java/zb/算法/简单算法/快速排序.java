package zb.算法.简单算法;


public class 快速排序 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; ++i) {
//            nums[i] = sc.nextInt();
//        }
        int[] nums = {2, 1, 3, 4, 41, 12, 234, 3, 12, 3123};
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();

        int[] numss = {2, 1, 31324, 3, 4, 41, 231, 123141};
        n = numss.length;
        test03(numss, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.printf("%d ", numss[i]);
        }
        System.out.println();

    }

    //    {11,23,4,13,5123};   0, 4

    /**
     *
     * @param nums
     * @param left
     * @param right
     */
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = nums[left];
        while (i < j) {
            //i表示left ,j代表right
            while (nums[++i] < x) ;//找到nums[i]的值比x大的 i值，
            while (nums[--j] > x) ;//找到nums[i]的值比x小的 j值，
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        quickSort(nums, left, j);
        quickSort(nums, j + 1, right);
    }

    public static void test01(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = nums[left];
        while (i < j) {
            while (nums[++i] < x) ;
            while (nums[--j] > x) ;
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        test01(nums, left, j);
        test01(nums, j + 1, right);
    }

    public static void test02(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
//        i表示开始位置，j表示结束位置
        int i = left - 1;
        int j = right + 1;
        int x = nums[left];
        while (i < j) {
            while (nums[++i] < x) ;
            while (nums[--j] > x) ;
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        test02(nums, left, j);
        test02(nums, j + 1, right);
    }

    public static void test03(int[] arr, int left, int right) {


    }



    public static void test05(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = arr[left];
        while (i < j) {
            while (arr[++i] < x) ;
            while (arr[--j] > x) ;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        test05(arr, left, j);
        test05(arr, j + 1, right);
    }

    public static void test06(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = arr[left];
        while (i < j) {
            while (arr[++i] < x) {
            }
            while (arr[--j] > x) {
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        test06(arr, left, j);
        test06(arr, j + 1, right);
    }

    public static void test04(int[] arr, int left, int right) {
        if (arr.length == 0) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = arr[left];
        while (i < j) {
            while (arr[++i] < x) {
            }
            while (arr[--j] > x) {
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        test06(arr, i, right);
        test06(arr, right + 1, j);

    }

    public static void test09(int[] arr,int left,int right){
        if(left>right){

        }
    }
}



