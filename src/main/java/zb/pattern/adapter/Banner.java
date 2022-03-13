package zb.pattern.adapter;

public class Banner {
    private final String string;
    public Banner(String string){
        this.string=string;
    }
    public void method1(){
        System.out.println("Banner....method1..");
    }
    public void method2(){
        System.out.println("Banner....method2..");
    }
}
