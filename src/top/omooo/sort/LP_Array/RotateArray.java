package top.omooo.sort.LP_Array;

/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 *
 * 示例一：
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 *
 * 示例二：
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 */
public class RotateArray {
    private static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int number = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = number;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
