import java.util.Scanner;

public class ShortestLongest {

    public static int customLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        int len = customLength(text), spaces = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] arr = new String[spaces + 1];
        int w = 0, start = 0;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') {
                arr[w++] = text.substring(start, i);
                start = i + 1;
            }
        arr[w] = text.substring(start, len);
        return arr;
    }

    public static String[][] wordsWithLengths(String[] arr) {
        String[][] out = new String[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            out[i][0] = arr[i];
            out[i][1] = String.valueOf(customLength(arr[i]));
        }
        return out;
    }

    public static int[] shortestLongest(String[][] wl) {
        int min = Integer.parseInt(wl[0][1]), max = min;
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < wl.length; i++) {
            int len = Integer.parseInt(wl[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[] {minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] wl = wordsWithLengths(words);
        int[] idxs = shortestLongest(wl);

        System.out.println("Shortest: " + wl[idxs[0]][0] + " (" + wl[idxs[0]][1] + ")");
        System.out.println("Longest:  " + wl[idxs[1]][0] + " (" + wl[idxs[1]][1] + ")");
    }
}
