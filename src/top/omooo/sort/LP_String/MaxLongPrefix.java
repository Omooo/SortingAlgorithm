package top.omooo.sort.LP_String;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀
 * 如果不存在公共前缀，返回空字符串 ""
 * 输入：["flower","flow","flight"]
 * 输出："fl"
 * 输入：["dog","racecar","car"]
 * 输出：""
 */
public class MaxLongPrefix {
    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        String result = judge(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            result = judge(result, strs[i]);
        }
        return result;
    }

    private static String judge(String string1, String string2) {
        String string="";
        if (string1.isEmpty() || string2.isEmpty()) {
            return string;
        } else {
            if (string1.length() > string2.length()) {
                String middle = string2;
                string2 = string1;
                string1 = middle;
            }
            char[] chars1 = string1.toCharArray();
            char[] chars2 = string2.toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] == chars2[i]) {
                    string += chars1[i];
                } else {
                    break;
                }
            }
            return string;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
