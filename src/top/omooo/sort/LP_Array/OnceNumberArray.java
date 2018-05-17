package top.omooo.sort.LP_Array;

import java.util.Arrays;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次之外
 * 其余元素均出现两次，找出那个只出现一次的元素
 *
 * 示例一：
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例二：
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class OnceNumberArray {
    private static int singleNumber(int[] nums) {
        //两个相同数字异或等于0，一个数和0异或等于它本身
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
