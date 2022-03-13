package com.test;

import com.app.designpattern.factorymethod.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mikael
 */
public class MapTest {
    public static void main(String[] args) {
        String[] strings = {"1000", "10001", "100002"};
        Demo demo = new Demo();

        ArrayList<Demo> arrayList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {

        }

        HashMap<Object, Object> hashMap = new HashMap<>();
        if(hashMap.isEmpty()){
            hashMap.put("k", "  ");
            System.out.println("empty!!!!!");
        }
        String k = hashMap.get("k").toString().trim();

        hashMap.put("1231", 883);
        hashMap.put("u", 123);

        hashMap.put("u", 1234324);
        hashMap.put("121", 9913);

        hashMap.put("31", 23);

        hashMap.put("3", 122313);

        Set<Object> objects = hashMap.keySet();
        for (int i = 0; i < objects.size(); i++) {
            Iterator<Object> iterator = objects.iterator();
//            while (iterator.next()){
//                iterator.
//            }
        }

    }
}

class Demo {
    private String uuid;
    private String bh;
    private String bz;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
