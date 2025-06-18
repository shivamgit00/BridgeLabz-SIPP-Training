import java.util.Scanner;

public class CharArrayCompare {

    public static char[] customCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] custom = customCharArray(input);
        char[] builtIn = input.toCharArray();

        boolean same = compareArrays(custom, builtIn);

        System.out.println("Are both arrays equal? " + same);
    }
}
