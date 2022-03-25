package zb.算法.简单算法;

import java.util.Stack;

public class 一个长string是否能被整除 {
    public static void main(String[] args) {
        compute("314213131",12341);
    }
    //运算
    public static void  compute(String dividend, int divisor){
        Stack<Character> stack  = new Stack<Character>();
        int remainder=0 ;
        int length = dividend.length() ;

        int divisorLength = Integer.toString(divisor).length() ;

        //将字符串压入栈,方便进行运算时一个一个的取出来进行运行

        for(int i = dividend.length() - 1; i >= 0 ; i --){
            stack.push(dividend.charAt(i) ) ;
        }

        //如果被除数的长度小于或等于除数的，直接转换进行运算
        if(length <= divisorLength ){
            remainder = Integer.parseInt( dividend ) % divisor ;

        } else { //如果被除数长度大于除数的，从高位开始依次进行运算，直到最后

            //构建一个临时的被除数
            StringBuilder sbDividendTemp = new StringBuilder() ;

            for(int i = 0 ; i < length ; i++){
                sbDividendTemp.append(stack.pop()) ;

                //如果临时被除数取出的被除数小于除数，继续从被除数中取
                if( Integer.parseInt( sbDividendTemp.toString() ) < divisor ){
                    continue ;
                }
                //把余数写入被除数，继续判断
                else {
                    remainder = Integer.parseInt( sbDividendTemp.toString()) % divisor ;
                    sbDividendTemp.delete(0, sbDividendTemp.length()) ;
                    if (remainder != 0 ) {
                        sbDividendTemp.append(Integer.toString(remainder));
                    }
                }
            }
        }

        //对结果进行判断
        if(remainder == 0 ){
            System.out.println(" 可以整除" ) ;
        } else{
            System.out.println(" 不能整除  ，余数是 ："  + remainder ) ;
        }
    }
}
