package top.omooo.sort.LP_Array;

import java.util.Arrays;

/**
 * 加一
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组
 * 最高位数字存放在数组的首位，数组中每个元素只存储一个数字
 * 可以假设除了整数0之外，这个整数不会以零开头
 * 示例：
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例：
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class AddOneArray {
    private static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return digits;
        }
        int c = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + c;
            c = temp / 10;
            digits[i] = temp % 10;
            if (c == 0) {
                return digits;
            }
        }
        //全为9时
        int[] result = new int[digits.length + 1];
        if (c == 1) {
            result[0] = c;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9, 9});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
