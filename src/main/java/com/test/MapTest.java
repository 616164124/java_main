package com.test;

import com.app.designpattern.factorymethod.ArrayList;

/**
 * @author mikael
 */
public class MapTest {
  public static void main(String[] args) {
      String[] strings={"1000","10001","100002"};
      Demo demo = new Demo();
      ArrayList<Demo> arrayList = new ArrayList<>();
      for(int i=0;i<strings.length;i++){

          }

  }
}
class Demo{
    private String uuid;
    private String  bh;
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
