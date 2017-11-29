package top.omooo.sort;

import java.util.Scanner;

/**
 * 冒泡排序
 * 第一次循环结束出最大值 ......
 */
public class BubbleSort {
	
	public static void sort(int[] data) {
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j]>data[j+1]) {
					int index=data[j+1];
					data[j+1]=data[j];
					data[j]=index;
				}
			}
		}
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"  ");
		}
	}
	public static void main(String[] args) {
		sort(TestSort.getData());
	}
}
