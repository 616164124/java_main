package zb.test;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import zb.pattern.decorator.One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("t");
        strings.add("s");
        strings.add("4");
        strings.add("6");
        removeList(strings, "s");
        System.out.println(strings);


        removeList2(strings, "");

    }

    //    删除list中指定的element
    public static List removeList(List list, Object element) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next.equals(element)) {
                iterator.remove();
            }
        }
        return list;
    }

    public static List removeList2(List list, Object element){

        return null;
    }

}
