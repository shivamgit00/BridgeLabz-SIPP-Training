import java.util.Scanner;

public class UpperCaseCompare {

    public static String toUpperCaseCustom(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String builtIn = input.toUpperCase();
        String custom = toUpperCaseCustom(input);

        boolean equal = compareStrings(builtIn, custom);

        System.out.println("Built-in: " + builtIn);
        System.out.println("Custom:   " + custom);
        System.out.println("Are both equal? " + equal);
    }
}
