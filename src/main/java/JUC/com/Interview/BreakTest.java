package JUC.com.Interview;

/**
 * @version: V1.0
 * @author: mikael
 * @className: BreakTest
 * @packageName: Interview
 * @description:
 * @data: 2020-10-25
 **/
public class BreakTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 88) {
                System.out.println("i\t" + i);
                break;
            }
            if (i > 79)
                System.out.println(i);
        }
    }
}
