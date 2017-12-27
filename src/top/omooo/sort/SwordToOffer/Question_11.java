package top.omooo.sort.SwordToOffer;

/**
 * double calc(double a,int b)
 * 求 a 的 b 次方
 */
public class Question_11 {

    public static double square(double a, int b) {
//        double result = 1.0;
//        for (int i = 0; i < b; i++) {
//            result = result * a;
//        }
//        return result;
        if (b == 0) {
            if (isZero(a)) {
                System.out.println("零的零次方式没有意义的哟");
                return 0;
            }else
                return 1;
        }
        if (b == 1) {
            return a;
        }
        if (b < 0) {
            return 1 / square(a, b * (-1));
        }
        int x = b / 2;
        int y = b % 2;
        double z = square(a, x);
        if (y == 0) {
            return z * z;
        } else {
            return z * z * a;
        }
    }
    /**
     * 判断double是否为零
     */
    public static boolean isZero(double x) {
        if ((x - 0.0 > -0.0000001) && (x - 0.0 < 0.0000001)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 测试
     */
    public static void test(double a, int b) {
        System.out.println(square(a, b));
    }
    public static void main(String[] args) {
        test(0.0, 0);
        test(1.0, 0);
        test(-1.0,0);
        test(2.0, 2);
        test(2.0, -2);
        test(-2.0,-2);
        test(2.0, 8);
    }
}
/**
 * 注意：
 * 1. 指数整形 b 要考虑到负整数以及零，同时还要考虑到底数 a 为零。
 *    在判断底数为零的时候，不能直接写 a==0，这是因为在计算机内表示小数时（float和double）都有误差。
 *    所以在判断两个小数是否相等，只能判断它们的差的绝对值是不是在一个很小的范围，如果这个范围很小，就可以认为它们相等。
 *
 * 2. 优化算法
 */
