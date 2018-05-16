package top.omooo.sort.LeetCode;

/**
 * 验证回文字符串
 * 给定一个字符串，验证它是否是回文串
 * 只考虑字母和数字字符，可以忽略字母的大小写
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 输入: "race a car"
 * 输出: false
 */
public class VerifyString {
    public static boolean isPalindrome(String string) {
        if (string.equals("") || string.length() == 1) {
            return true;
        }
        StringBuilder s = new StringBuilder(string.trim().toLowerCase());
        char[] chars = s.toString().toCharArray();
        s = new StringBuilder();
        for (char aChar : chars) {
            if ((aChar >= 48 && aChar <= 57) || (aChar >= 97 && aChar <= 122)) {
                s.append(aChar);
            }
        }
        System.out.println(s);
        chars = s.toString().toCharArray();
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //JDK自带方法
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new StringBuilder(s).reverse().toString());

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
