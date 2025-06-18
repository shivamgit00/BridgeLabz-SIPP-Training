import java.util.Scanner;

public class LowerCaseCompare {

    public static String toLowerCaseCustom(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String originalText = scanner.nextLine();

        String lowerBuiltIn = originalText.toLowerCase();
        String lowerCustom = toLowerCaseCustom(originalText);

        boolean isSame = compareStrings(lowerBuiltIn, lowerCustom);

        System.out.println("Built-in lowercase: " + lowerBuiltIn);
        System.out.println("Custom lowercase:   " + lowerCustom);
        System.out.println("Are both equal? " + isSame);
    }
}
