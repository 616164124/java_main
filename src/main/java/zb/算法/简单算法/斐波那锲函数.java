package zb.算法.简单算法;

/**
 * 斐波那锲函数
 * 当 n>=3 时  f(n) = f(n-1) + f(n-2)
 */
public class 斐波那锲函数 {
    public static void main(String[] args) {
//        count表示第几个数
        for (int counter = 0; counter <= 20; counter++) {
//            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }

        for (int counter = 0; counter <= 20; counter++) {
            System.out.printf("test01 of %d is: %d\n", counter, test01(counter));
        }

        System.out.println(test01(20));


        for (int counter = 0; counter <= 20; counter++) {
            System.out.printf("test02 of %d is: %d\n", counter, test02(counter));
        }
    }

    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static long test01(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return test01(number - 1) + test01(number - 2);
        }
    }

    public static long test02( long number){
        if(number==0||number==1){
            return  number;
        }else {
            return test02(number-1)+test02(number-2);
        }
    }
}