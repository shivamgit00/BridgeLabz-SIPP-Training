import java.util.Scanner;

public class LengthWithoutLen {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println("Custom length: " + customLength(input));
        System.out.println("Built-in length: " + input.length());
    }
}
