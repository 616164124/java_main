package zb.pattern.test.demo1;


public class Son extends Father implements MethodInterface {

    private final String ss = "12";

    public void smethod1() {
        System.out.println("smethod1.....");
    }

    public void fmethod1() {
        System.out.println("fmethod1.....son");
    }

    @Override
    public void interface1() {
        System.out.println("interface1.....");
    }

}
