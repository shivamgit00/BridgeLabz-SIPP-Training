import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println("Result: " + result);
    }

    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // generateException(input);
        handleException(input);
    }
}
