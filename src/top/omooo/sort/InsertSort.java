package top.omooo.sort;

/**
 * 插入排序
 * 将n个元素的数列分为已有序和无序两个部分，每次处理就是将无序数列的第一个元素与有序数列的元素从后往前逐个进行比较，
 * 找出插入位置，将该元素插入到有序数列的合适位置中。
 */
public class InsertSort {
    public static void sort(int[] data) {
        for (int i=1;i<data.length;i++) {
            for (int j=i;(j>0)&&(data[j]<data[j-1]);j--) {
                int index=data[j];
                data[j]=data[j-1];
                data[j-1]=index;
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
