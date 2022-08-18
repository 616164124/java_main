package zb.pattern.test.demo2;

public class Main {
    public static void main(String[] args) {
        TwoInterface interface1 = new OneInterface() {


            @Override
            public void TwoInterface1() {

            }

            @Override
            public void OneInterface1() {
                System.out.println(" main ....OneInterface1....");
            }

        };
//        oneInterface.abstractFace();
        interface1.TwoInterface1();

        Three three = new Three();
        three.ThreeInterface();


    }
}
