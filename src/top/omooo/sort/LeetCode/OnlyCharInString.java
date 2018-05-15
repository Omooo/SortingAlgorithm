package top.omooo.sort.LeetCode;

/**
 * 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，返回 -1
 * 输入：s="leetcode"  输出：0
 * 输入：s="loveleetcode"  输出：2
 * 假定该字符串只包含小写字母
 */
public class OnlyCharInString {
    private static int search(String string) {
        if (string.length() == 0) {
            return -1;
        } else if (string.length() == 1) {
            return 0;
        }
        int[] ints = new int[256];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 0;
        }
        char[] chars = string.toCharArray();
        char c = chars[0];
        for (char aChar : chars) {
            ints[aChar] += 1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (ints[chars[i]] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search("leetcode"));
        System.out.println(search("loveleetcode"));
    }
}
