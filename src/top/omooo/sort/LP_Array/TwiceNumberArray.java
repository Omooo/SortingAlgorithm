package top.omooo.sort.LP_Array;

import java.util.ArrayList;
import java.util.List;

public class TwiceNumberArray {
    private static int[] singleNumber(int[] nums) {
        //两个相同数字异或等于0，一个数和0异或等于它本身，一个数异或两次等于它本身
        int[] ints = new int[nums.length];
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        for (int i = 0; i < nums.length; i++) {
            ints[i] = result ^ nums[i];
        }
        return ints;
    }

    public static void findThreeNumber(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum ^ a[i];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int u = sum ^ a[i];
            if (list.contains(u)) {
                list.remove(Integer.valueOf(u));
            } else {
                list.add(u);
            }
        }
        System.out.println((sum ^ list.get(0)) + " " + (sum ^ list.get(1)) + " " + (sum ^ list.get(2)));
    }


    public static void main(String[] args) {
//        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));

        int[] ints = singleNumber(new int[]{2, 2, 1, 3, 5, 5});
        for (int i : ints) {
            System.out.println(i);
        }
        findThreeNumber(new int[]{2, 2, 1, 3, 6, 5, 5});
    }
}
