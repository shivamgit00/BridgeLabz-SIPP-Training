import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is Armstrong Number.");
        } else {
            System.out.println(number + " is Not Armstrong Number.");
        }
    }
}
