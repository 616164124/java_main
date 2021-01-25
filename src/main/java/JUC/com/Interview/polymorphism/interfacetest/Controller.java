package JUC.com.Interview.polymorphism.interfacetest;

/**
 * @version: V1.0
 * @author: mikael
 * @className: Controller
 * @packageName: Interview.polymorphism.interfacetest
 * @description:
 * @data: 2020-12-04
 **/
public class Controller {
    private static Service service;

    public static void main(String[] args) {
        // String controller = service.say("controller");
        ServiceImpl service = new ServiceImpl();
        service.say("ServiceImpl");
        System.out.println("\t" + service.say("ServiceImpl"));

    }
}
