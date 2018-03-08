package top.omooo.sort.DailyPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个字符串打印出该字符串的所有排列
 */
public class StringArrange {

    public static void main(String[] args) {
        char[] source = removeRepeat("abbca").toCharArray();
        permutationStr(source, 0, source.length);
    }

    //字符串去重
    private static String removeRepeat(String string) {
        List<String> list = new ArrayList();
        for (int i = 0; i < string.length(); i++) {
            if (list.isEmpty() || !list.contains(string.substring(i, i + 1))) {
                list.add(string.substring(i, i + 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return sb.toString();
    }

    //递归求字符串的全排列
    private static void permutationStr(char p[], int depth, int length) {
        if (depth == length) {
            System.out.println(p);
            return;
        }
        char c;
        for (int i = depth; i < length; i++) {
            c=p[depth];
            p[depth] = p[i];
            p[i] = c;
            permutationStr(p, depth + 1, length);
            c=p[depth];
            p[depth] = p[i];
            p[i] = c;
        }
    }
}
