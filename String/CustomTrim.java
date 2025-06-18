import java.util.Scanner;

public class CustomTrim {

    public static int[] findBounds(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[] {start, end};
    }

    public static String subStr(String s, int start, int end) {
        String out = "";
        for (int i = start; i <= end; i++) out += s.charAt(i);
        return out;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] b = findBounds(text);
        String custom = subStr(text, b[0], b[1]);
        String builtin = text.trim();

        System.out.println("Custom trimmed: \"" + custom + "\"");
        System.out.println("Built-in trim:  \"" + builtin + "\"");
        System.out.println("Equal? " + compareStrings(custom, builtin));
    }
}
