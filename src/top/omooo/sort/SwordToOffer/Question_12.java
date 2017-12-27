package top.omooo.sort.SwordToOffer;

/**
 * 打印 1 到最大的 n 位数
 * 例：n = 3 
 * 输出：1 2 3 4 ...... 999
 */
public class Question_12 {

    private int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void printNumber(int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = "0";
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j < 10; j++) {
                strings[i] = j + "";
                getNumber(strings);
                if (j == 9 && strings[0] != "9" && i >= 1) {
                    strings[i - 1] = (Integer.parseInt(strings[i - 1]) + 1) + "";
                    strings[i] = "0";
                    j = 1;
                }
            }
        }
//        for (int i = 0; i < Math.pow(10, n) - 1; i++) {
//            System.out.print(i + "  ");
//        }
    }

    public static void getNumber(String[] strings) {
        String number = "";
        for (int i = 0; i < strings.length; i++) {
            number = number + strings[i];
        }
        System.out.println(number);
    }
    public static void main(String[] args) {
        printNumber(2);

    }
}
