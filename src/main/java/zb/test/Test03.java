package zb.test;

import com.netty.netty.groupchat.User;

import java.util.HashMap;

public class Test03 {
    public static void main(String[] args) {
    String url ="http://localhost:8081/hscweb/djxx/csht/addDjxx.do";
        System.out.println();
        System.out.println(url.substring(0, url.indexOf("/hscweb")));
        User user = new User();
        user.getClass().getClassLoader();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("12313", "ffw");
        String s = hashMap.get("124");
        String s1 = "'"+s+"'";
        System.out.println(s1.replaceAll(",", "','"));


//        url.substring()

    }
}