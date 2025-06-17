import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int gcd = 0;
        int a = number1;
        int b = number2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;

        int lcm = (number1 * number2) / gcd;

        System.out.println(lcm);
    }
}
