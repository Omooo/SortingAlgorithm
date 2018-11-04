package top.omooo.sort.LP_Array;

import java.util.Arrays;

public class TopKArray {
    public static void testBuildMINHeap() {
        int[] a = {49, 38, 65, 97, 76, 13, 49, 78, 34, 12, 64};
        int k = 4;
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = a[i];
        }
        buildMinHeap(topK, k);
        for (int i = k; i < a.length; i++) {
            int root = topK[0];
            //当数据大于根结点的时候，替换根节点，并进行更新堆
            if (a[i] > root) {
                topK[0] = a[i];
                //buildMinHeap(topK, k);
                heapfiy(topK, 0, k);
            }
        }
        //buildMinHeap(a,a.length);

        System.out.println(Arrays.toString(topK));
    }

    public static void heapfiy(int[] a, int i, int len) {
        //int len=a.length;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        while (true) {
            if (left < len && a[left] < a[smallest])
                smallest = left;
            if (right < len && a[right] < a[smallest])
                smallest = right;
            if (i != smallest) {
                int temp = a[i];
                a[i] = a[smallest];
                a[smallest] = temp;
            } else
                break;
            i = smallest;
            left = 2 * i + 1;
            right = 2 * i + 2;
        }
    }

    public static void buildMinHeap(int[] a, int len) {
        //int len=a.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapfiy(a, i, len);
        }
    }


    public static void main(String[] args) {
        testBuildMINHeap();
    }
}
