package zb.test.回调;

import java.io.Serializable;

class Father {
    private String name;
    public void say() {
        System.out.println("say...father");
        run();
    }
    //    回调son中的run方法
    void run() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Son extends Father implements Serializable {
    public void run() {
        System.out.println("run....son");
    }
}

public class Test01 {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father();
        father.setName("12313");
        Father father1 = father;
        Son father11 = (Son) father1;

        son.say();



    }
}
