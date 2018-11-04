package top.omooo.sort;

import java.util.Arrays;

public class QuickSort {

    private int division(int[] list, int left, int right) {
        //以左边的数（left）为基准
        int base = list[left];
        while (left < right) {
            //从序列右端开始，从左遍历，知道找到小于base的数
            while (left < right && list[right] >= base)
                right--;
            //找到了比base小的元素，将这个元素放到最左边的位置
            list[left] = list[right];

            //从序列左端开始，向右遍历，直到找到大于base的数
            while (left < right && list[left] <= base)
                left++;
            //找到了比base大的元素，将这个元素放到最右边的位置
            list[right] = list[left];
        }
        //最后将base放到left位置，此时，left位置的左侧数值都应该比left小;
        //而left位置的右侧数值都应该比left大。
        list[left] = base;
        return left;
    }

    private void quickSort(int[] list, int left, int right) {
        //左下标一定小于又下标，否则就越界了
        if (left < right) {
            //对数组进行分割，取出下次分割的基准标号
            int base = division(list, left, right);
            //对基准标号左侧的一组数组进行递归的切割，以至于将这些数值完整的排序
            quickSort(list, left, base - 1);
            //对基准标号右侧的一组数值进行递归的切割，以至于将这些数值
            quickSort(list, base + 1, right);
        }
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] ints = new int[]{2, 5, 1, 3, 0, 3, 9, 4};
        quickSort.quickSort(ints, 0, ints.length - 1);
    }
}
