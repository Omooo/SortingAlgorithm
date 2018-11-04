package top.omooo.sort;

import java.util.Arrays;

public class HeapSort {

    private void heapAdjust(int[] array, int parent, int length) {

        //保存当前父节点
        int temp = array[parent];
        //先获取左孩子
        int child = 2 * parent + 1;

        while (child < length) {
            //如果有右结点，并且右结点的值大于左结点，则选取右结点
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }

            //如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= array[child])
                break;

            //把孩子结点的值赋给父结点
            array[parent] = array[child];

            //选取孩子结点的左结点，继续向下筛选
            parent = child;
            child = 2 * child + 1;
        }

        array[parent] = temp;
    }

    private void heapSort(int[] list) {
        //循环建立初始堆
        for (int i = list.length / 2; i >= 0; i--) {
            heapAdjust(list, i, list.length);
        }

        //进行n-1次循环，完成排
        for (int i = list.length - 1; i > 0; i--) {
            //最后一个元素和第一个元素进行交换
            int temp = list[i];
            list[i] = list[0];
            list[0] = temp;

            heapAdjust(list, 0, i);
            System.out.format("第 %d 趟: \t", list.length - i);
            printPart(list, 0, list.length - 1);
        }
    }

    // 打印序列
    private void printPart(int[] list, int begin, int end) {
        for (int i = 0; i < begin; i++) {
            System.out.print("\t");
        }
        for (int i = begin; i <= end; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] array = new int[]{5, 3, 7, 9, 2, 8, 0};
        System.out.print("排序前:\t");
        heapSort.printPart(array, 0, array.length - 1);
        heapSort.heapSort(array);
        System.out.print("排序后:\t");
        heapSort.printPart(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
