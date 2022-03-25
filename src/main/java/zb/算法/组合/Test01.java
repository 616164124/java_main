package zb.算法.组合;

import java.util.ArrayList;
import java.util.List;

/**
 * 0-n 之间所有k个数的组合
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(combine(4, 3));
    }
    public static  List<List<Integer>> combine(int n,int k){
        List<List<Integer>> res =new ArrayList<>();
        help(res,new ArrayList<>(),n,k,1);
        return res;
    }
    public static void help(List<List<Integer>> res,List<Integer> temp,int n,int k ,int start){
        if(k==0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i=start;i<=n;i++){
            temp.add(i);
            help(res,temp,n,k-1,i+1);
            temp.remove(temp.size()-1);
        }
    }

}
