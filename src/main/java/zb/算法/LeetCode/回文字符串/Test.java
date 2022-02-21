package zb.算法.LeetCode.回文字符串;

public class Test {
    /**
     * 我们可以从字符串的每个位置开始
     * <p>
     * 然后以当前位置为中轴，判断有多少以当前位置为中轴的回文子串
     * <p>
     * 这里要注意，回文串有奇数长度的，也有偶数长度的
     *
     * @param s
     * @return
     */
    public static int countSubstrings(String s) {
        if (s == null) return 0;
        if (s.length() == 1) return 1;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += extendsString(s, i, i); // 奇数长度子串
            count += extendsString(s, i, i + 1); // 偶数长度子串
        }
        return count;
    }

    //aaaa
    public static int extendsString(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
            System.out.println(s.substring(0, r));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("ieei"));
    }

}
