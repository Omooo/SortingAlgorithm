package top.omooo.sort;

import java.util.Scanner;

//测试类
public class TestSort {
    public static int[] getData() {
        Scanner scanner=new Scanner(System.in);
        String[] nums = null;
        nums = scanner.nextLine().split(" ");
        int data[]=new int[nums.length];
        for(int i=0;i<data.length;i++){
            data[i]=Integer.valueOf(nums[i]);
        }
        return data;
    }

}
