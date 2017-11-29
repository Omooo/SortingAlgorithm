package top.omooo.sort;

import java.util.Scanner;

/**
 * 选择排序
 *
 */
public class SelectionSort {
	
	public static void sort(int[] data) {
		for(int x=0;x<data.length-1;x++) {
			for(int y=x+1;y<data.length;y++) {
				if(data[x]>data[y]) {
					int index=data[x];
					data[x]=data[y];
					data[y]=index;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] nums = null;   
	    nums = scanner.nextLine().split(" ");   
	    int data[]=new int[nums.length];  
	    for(int i=0;i<data.length;i++){  
	    	data[i]=Integer.valueOf(nums[i]);  
	    }
	    sort(data);
	    for(int i=0;i<data.length;i++){  
	    	System.out.print(data[i]+"  ");  
	    }
	}

}
