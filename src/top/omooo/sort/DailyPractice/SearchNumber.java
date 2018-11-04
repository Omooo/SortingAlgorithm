package top.omooo.sort.DailyPractice;

public class SearchNumber {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 1, 2, 3, 1, 1, 1, 2, 2, 2, 2, 2};
        System.out.println(findMostApperse(array));
    }

    private static int findMostApperse(int[] array) {
        int count = 0;
        int result = 0;
        for (int i : array) {
            if (count == 0) {
                result = i;
                ++count;
            } else {
                if (result == i) {
                    ++count;
                } else {
                    --count;
                }
            }
        }
        return result;
    }
}
