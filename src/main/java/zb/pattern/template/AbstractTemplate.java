package zb.pattern.template;


import com.dao.User;


public abstract class AbstractTemplate {
    String data = "123";
    User user=new User(12,"u",44);
    //其他子方法
    abstract void getData();

    //通用的方法
    void setData() {
        System.out.println("Abstract..setData.." + data);
    }
}
