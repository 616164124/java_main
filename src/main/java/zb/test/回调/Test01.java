package zb.test.回调;

class Father {
    public void say() {
        System.out.println("say...father");
        run();
    }
    //    回调son中的run方法
    void run() {
    }
}

class Son extends Father {
    public void run() {
        System.out.println("run....son");
    }
}

public class Test01 {
    public static void main(String[] args) {
        Son son = new Son();
        son.say();
    }
}
