import java.util.Scanner;

public class SplitWithLengths {

    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int len = customLength(text), spaces = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] words = new String[spaces + 1];
        int w = 0, start = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') {
                words[w++] = text.substring(start, i);
                start = i + 1;
            }
        words[w] = text.substring(start, len);
        return words;
    }

    public static String[][] wordsWithLengths(String[] arr) {
        String[][] out = new String[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            out[i][0] = arr[i];
            out[i][1] = String.valueOf(customLength(arr[i]));
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordsWithLengths(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.printf("%-10s %d%n", row[0], Integer.parseInt(row[1]));
        }
    }
}
