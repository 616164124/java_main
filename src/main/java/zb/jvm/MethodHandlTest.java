package zb.jvm;

import com.dao.User;

import java.lang.invoke.MethodHandle;

public class MethodHandlTest {
    public static void main(String[] args) {
        MethodHandle handle01= null;
        try {
            Object invoke = handle01.invoke(Test01.class);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
class Test01{
    private int a;
    private User user;

    public void say(){
        System.out.println("test01===say");
    }
}

