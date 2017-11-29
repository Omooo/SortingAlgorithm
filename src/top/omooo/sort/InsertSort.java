package top.omooo.sort;

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
