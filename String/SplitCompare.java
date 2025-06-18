import java.util.Scanner;
import java.util.Arrays;

public class SplitCompare {

    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int len = customLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] words = new String[spaces + 1];
        int w = 0, start = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[w++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[w] = text.substring(start, len);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] a1 = customSplit(text);
        String[] a2 = text.split(" ");

        System.out.println("Custom: " + Arrays.toString(a1));
        System.out.println("Built-in: " + Arrays.toString(a2));
        System.out.println("Equal? " + compareArrays(a1, a2));
    }
}
