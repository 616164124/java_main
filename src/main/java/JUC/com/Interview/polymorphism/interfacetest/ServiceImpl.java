package JUC.com.Interview.polymorphism.interfacetest;

/**
 * @version: V1.0
 * @author: mikael
 * @className: ServiceImpl
 * @packageName: Interview.polymorphism.interfacetest
 * @description:
 * @data: 2020-12-04
 **/
public class ServiceImpl implements Service {
    @Override
    public String say(String str) {

        return str + "ServiceImpl";
    }
}
