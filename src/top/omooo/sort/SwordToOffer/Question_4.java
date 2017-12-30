package top.omooo.sort.SwordToOffer;

/**
 * 替换空格
 */
public class Question_4 {
    public static void ReplaceBlank(char[] chars) {
        int originalLength = chars.length;
        int newLength = originalLength;
        for (int i = 0; i < originalLength; i++) {
            if (chars[i] == ' ') {
                newLength = newLength + 2;
            }
        }
        char[] newChars = new char[newLength];
        int indexOfOriginal = originalLength-1;
        int indexOfNew = newLength-1;
        while (indexOfOriginal >= 0 && indexOfNew >= indexOfOriginal) {
            if (chars[indexOfOriginal] == ' ') {
                newChars[indexOfNew--] = '0';
                newChars[indexOfNew--] = '2';
                newChars[indexOfNew--] = '%';
            } else {
                newChars[indexOfNew--] = chars[indexOfOriginal];
            }
            indexOfOriginal--;
        }
        System.out.println(newChars.length);
        for (int i = 0; i < newChars.length; i++) {
            System.out.print(newChars[i]);
        }
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'O', 'm', 'o', 'o', 'o', ' ',' ', '_'};
        ReplaceBlank(chars);
    }
}
/**
 * 从后向前 时间复杂度 O(n)
 * 从前向后 时间复杂度 O(n*n)
 */
