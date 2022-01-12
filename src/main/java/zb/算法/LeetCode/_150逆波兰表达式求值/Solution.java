package zb.算法.LeetCode._150逆波兰表达式求值;

//
//tokens = ["2","1","+","3","*"]
//        输出：9
//        解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9

import org.junit.Test;

import java.util.Stack;

public class Solution {

    @Test
    public void test() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens));
        System.out.println(4 / 13);
    }

    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (flag(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(calc(left, right, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    //判断符号
    private boolean flag(String token) {
        return "+-*/".contains(token);
    }

    //计算
    private int calc(Integer left, Integer right, String token) {
        switch (token) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            default:
                return left / right;
        }
    }


}
