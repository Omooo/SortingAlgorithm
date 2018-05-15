package top.omooo.sort.DailyPractice;

public class ConstructWord {
    private static boolean isConstructful(char chars[][], char[] charsSet) {
        int rIndex=0;
        int cIndex=0;
        int flag = 0;
        for (int k = 0; k < charsSet.length; k++) {
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    if (charsSet[k] == chars[i][j]) {
                        if (k == 0) {
                            flag++;
                        } else if ((Math.abs(i - rIndex) == 1 && Math.abs(j - cIndex) == 1)
                                || (Math.abs(i - rIndex) == 0 && Math.abs(j - cIndex) == 1)
                                || (Math.abs(i - rIndex) == 1 && Math.abs(j - cIndex) == 0)) {
                            flag++;
                        }
                        rIndex = i;
                        cIndex = j;
                    }
                }
            }
        }
        if (flag == charsSet.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] chars = new char[][]{{'G', 'I', 'Z'}, {'U', 'E', 'K'}, {'Q', 'S', 'M'}};
        String word1 = "GEKS";
        System.out.println(isConstructful(chars,word1.toCharArray()));
        String word2 = "QUIZ";
        System.out.println(isConstructful(chars, word2.toCharArray()));
        String word3 = "GUQE";
        System.out.println(isConstructful(chars, word3.toCharArray()));
        String word4 = "QISE";
        System.out.println(isConstructful(chars, word4.toCharArray()));
        String word5 = "GUIS";
        System.out.println(isConstructful(chars, word5.toCharArray()));
    }
}
