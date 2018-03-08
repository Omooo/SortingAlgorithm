package top.omooo.sort.DailyPractice;

/**
 * 在字符串中找出第一个只出现一次的字符
 */
public class StringFirstNoRepeat {
    public static void main(String[] args) {
        String string = "abcbad";
        char result = findString(string.toCharArray(), string.length());
        System.out.println(result);
    }

    private static char findString(char p[],int length) {
        if (length == 1) {
            return p[0];
        }
        int c[] = new int[256];
        int i;
        char r = p[0];
        for (i = 0; i < 256; i++) {
            c[i] = 0;
        }
        //以p的值作为数组c的下标，c的值表示字符i在p中出现的次数
        for (i=0;i<length;i++) {
            c[p[i]] += 1;
        }
        for (i=0;i<length;i++) {
            if (c[p[i]] == 1) {
                r = p[i];
                break;
            }
        }
        return r;
    }
}
