package com.test;

public class Upsbxx {

    public static void main(String[] args) {
        String bqje = "100";
        String jfs = "1312";
        String upsbxx1 = "update CSHT_SB_SBXX set xgrq=SYSDATE,BDZDNR=nvl(BDZDNR,0)+ " + bqje + " where sbxxuuid =\"" + jfs + "\"";
        System.out.println(upsbxx1);
    }

}
