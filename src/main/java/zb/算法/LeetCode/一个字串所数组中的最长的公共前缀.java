package zb.算法.LeetCode;



public class 一个字串所数组中的最长的公共前缀 {
    public static void main(String[] args) {
        String[] s = {"flow","flower","floewabc"};
        String s1 = find(s);
        System.out.println(s1);

    }

    public static String  find(String[] s){
        if(s==null){
            return "";
        }
        int i = Integer.MAX_VALUE;
        String str="";
        for (String s1 : s) {
            if(i>s1.length()){
                i=s1.length();
                str=s1;
            }

        }
        for (String s1 : s) {
            for(int j =0;j<str.length();j++){
                if(str.charAt(j) !=s1.charAt(j) ){
                    str=s1.substring(0,j);
                }
            }
        }
        System.out.println("str="+str+"\ti="+i);
        return str;
    }
}
