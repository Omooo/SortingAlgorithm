package top.omooo.sort.LP_String;

/**
 * 翻转字符串
 * 输入：s="hello"
 * 输出："olleh"
 */
public class FlipString {
    private static String flip(String s) {
        char[] chars = s.toCharArray();
        StringBuilder result= new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(flip("Hello World"));
    }
}
