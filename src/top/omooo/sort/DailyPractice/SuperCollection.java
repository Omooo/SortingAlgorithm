package top.omooo.sort.DailyPractice;

/**
 * 判断超集合
 * 我们定义一个字符串的超集为：
 * 若字符串A包含字符串B中的所有字符，
 * 且字符串A中某一个字符a的数量不小于a在字符串B中的数量，
 * 那么A为B的超集。
 * 例：A="abbccdd" B="abcdd" true
 *     A="abbccd" B="abcdd"  false
 */
public class SuperCollection {
    private static boolean isSuperSet(char[] charsOne, char[] charsTwo) {

        if (charsOne.length < charsTwo.length) {
            return false;
        }
        int[] intsOne = toIntArray(charsOne);
        int[] intsTwo = toIntArray(charsTwo);
        for (int i = 0; i < intsTwo.length; i++) {
            if (intsOne[i] < intsTwo[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] toIntArray(char[] chars) {
        //取字符最大Ascall
        int[] counts = new int[256];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        //以aChar的值作为数组counts的下标，counts[aChar]的值表示该字符在chars中出现的次数
        for (char aChar : chars) {
            counts[aChar] += 1;
        }
        return counts;
    }

    public static void main(String[] args) {
        String a = "abbccdd";
        String b = "abcdd";
        System.out.println(isSuperSet(a.toCharArray(), b.toCharArray()));
        String c = "abbccd";
        String d = "abcdd";
        System.out.println(isSuperSet(c.toCharArray(),d.toCharArray()));
    }
}
