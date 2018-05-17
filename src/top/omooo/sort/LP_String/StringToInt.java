package top.omooo.sort.LP_String;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/37/
 */
public class StringToInt {
    private static int judge(String str) {
        if (str.isEmpty()) return 0;
        int sign = 1;
        // 转换值
        int base = 0;
        // 索引位数
        int i = 0;
        // 剔除开始空白字符
        while (str.charAt(i) == ' ')
            i++;
        // 判断正负号
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;

        // 索引有效数字字符
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {

            // that statement is used to test if the num is bigger than INT_MAX after the str[i] is handled, if base > INT_MAX/10,
            // then base10+ str[i] -‘0’> base10>INT_MAX, or when base== INT_MAX/10, that means all the places are the same as INT_MAX except the ones place, so str[i]>‘7’ is needed.
            // 上面这段是LeetCode国外站对下面代码的解释。
            // 简单来说就是
            // 如果`base > MAX_VALUE/10`，那么`base*10 + new_value` > `base*10` > `MAX_VALUE`。这个应该很容易理解，这种情况下就会发生溢出。
            // 若`base == INT_MAX/10`，而且`new_value = str.charAt(i++) - '0'`大于`7`，也会发生溢出。因为`MAX_VALUE = 2147483647`
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // 计算转换值
            base = 10 * base + (str.charAt(i++) - '0');
        }

        // 计算结果值
        return base * sign;
    }

    public static void main(String[] args) {
        System.out.println(judge(""));
        System.out.println(judge("+"));
        System.out.println(judge("-"));
        System.out.println(judge("+-2"));
        System.out.println(judge("   -42"));
        System.out.println(judge("4193 with words"));
        System.out.println(judge("words and 987"));
        System.out.println(judge("-91283472332"));
        System.out.println(judge("91283472332dd"));
        System.out.println(judge("20000000000000000000"));
        System.out.println(judge("9223372036854775807"));
    }
}
