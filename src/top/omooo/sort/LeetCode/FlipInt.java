package top.omooo.sort.LeetCode;

import sun.rmi.runtime.Log;

/**
 * 颠倒整数
 * 给定一个32位的有符号的整数，将整数中的数字进行反转
 * 输入：123 输出：321
 * 输入：-123 输出：-321
 * 输入：120 输出：21
 */
public class FlipInt {
    private static int flip(int nub) {
        if (nub == 0) {
            return nub;
        }
        StringBuilder string = new StringBuilder();
        long result;
        char[] chars = String.valueOf(nub).toCharArray();
        if (chars[0] == '-') {
            string = new StringBuilder("-");
            for (int i = chars.length - 1; i > 0; i--) {
                if (chars[i] != '0' || i != chars.length - 1) {
                    string.append(chars[i]);
                }
            }
        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] != '0' || i != chars.length - 1) {
                    string.append(chars[i]);
                }
            }
        }
        result = Long.parseLong(string.toString());
        if (Math.abs(result) > Math.pow(2, 31)) {
            return 0;
        } else {
            return (int) result;
        }
    }

    public static void main(String[] args) {
        System.out.println(flip(123));
        System.out.println(flip(-123));
        System.out.println(flip(120));
        System.out.println(flip(102));
        System.out.println(flip(1534236498));
        System.out.println(flip(-214648));
    }
}
