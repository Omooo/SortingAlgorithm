package top.omooo.sort.LeetCode;

/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1
 * 当 needle 是空字符串时我们应当返回 0
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class StringHasString {
    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        } else {
            if (haystack.isEmpty() || haystack.length() < needle.length()) {
                return -1;
            }
            char[] charsH = haystack.toCharArray();
            char[] charsN = needle.toCharArray();
            for (int i = 0; i < charsH.length; i++) {
                if (charsH[i] == charsN[0]) {
                    if (i + charsN.length <= charsH.length) {
                        int t = search(charsH, charsN, i);
                        if (t != -1) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }
    }

    private static int search(char[] charsH,char[] charsN, int index) {
        for (int i = 0; i < charsN.length; i++) {
            if (charsN[i] != charsH[index + i]) {
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("mississippi", "issipi"));
    }
}
