package top.omooo.sort.LP_Array;

import java.util.Arrays;

/**
 * 两个数组的交集
 * 给定两个数组，写一个方法来计算它们的交集
 *
 * 示例：给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 */
public class IntersectionArray {
    private static int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 > len2 ? len2 : len1;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums = new int[len];
        int k = 0;
        int curr1, curr2 = 0;
        for (int i=0,j=0;i<len1&&j<len2;) {
            curr1 = nums1[i];
            curr2 = nums2[j];
            if (curr1 == curr2) {
                nums[k] = curr1;
                k += 1;
                i += 1;
                j += 1;
            } else if (curr1 < curr2) {
                i += 1;
            } else {
                j += 1;
            }
        }
        return Arrays.copyOfRange(nums, 0, k);
    }

    public static void main(String[] args) {
        int[] result = intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int aResult : result) {
            System.out.println(aResult);
        }
    }
}
