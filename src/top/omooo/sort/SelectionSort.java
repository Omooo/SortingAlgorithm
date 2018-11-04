package top.omooo.sort;


/**
 * 选择排序
 * 第一次循环结束出最小数 ......
 */
public class SelectionSort {
	
	public static void sort(int[] data) {
		for(int x=0;x<data.length-1;x++) {
			for(int y=x+1;y<data.length;y++) {
				if(data[x]<data[y]) {
					int index=data[x];
					data[x]=data[y];
					data[y]=index;
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
