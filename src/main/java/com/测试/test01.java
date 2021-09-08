package com.测试;

public class test01 {
    public static void main(String[] args) {

        int add = add();
        System.out.println(add);

        System.out.println("jfklsjflsf");
    }

    public static int add(){
        int i =0;
        for (int i1 = 0; i1 < 10; i1++) {
            i++;
            if(i==7){
                return i;
            }
        }
        return i;
    }
}
