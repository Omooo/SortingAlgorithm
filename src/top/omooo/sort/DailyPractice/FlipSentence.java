package top.omooo.sort.DailyPractice;

/**
 * 反转句子，例：I am girl.  --> girl am I
 */
public class FlipSentence {

    private static void flipString(String string) {
        String[] strings=string.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i].toString());
        }
    }

    public static void main(String[] args) {
        flipString("I am a girl");
    }
}
