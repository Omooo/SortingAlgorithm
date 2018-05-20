package top.omooo.sort.LP_Array;

/**
 * 移动零
 * 给定一个数组nums，编写一个函数将所有0移动到数组的末尾
 * 同时保持非0元素的相对顺序
 * 示例：
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroArray {
    private static void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
//        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{1, 0, 1});
    }
}
