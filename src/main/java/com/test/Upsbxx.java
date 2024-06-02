package com.test;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class Upsbxx {

    public static void main(String[] args) {
        //带不带引号
        String bqje = "100";
        String jfs = "1312";
        String upsbxx1 = "update CSHT_SB_SBXX set xgrq=SYSDATE,BDZDNR=nvl(BDZDNR,0)+ " + bqje + " where sbxxuuid =\"" + jfs + "\"";
        System.out.println(upsbxx1);

    }

}
