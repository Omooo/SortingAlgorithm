package top.omooo.sort.LP_Array;

/**
 * 从排序数组中删除重复项
 * 给定一个排序数组，需要在原地删除重复元素，使得每个元素只出现一次
 * 返回移除后数组的新长度
 * 不需要额外的数组空间
 *
 * 示例一：
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素
 *
 * 示例二：
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素
 */
public class RemoveFromArray {
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return index;
    }

    public static void main(String[] args) {
        int index = removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println("不重复元素个数为：" + index);
    }
}
