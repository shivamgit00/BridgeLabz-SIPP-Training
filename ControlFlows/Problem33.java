import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        double result = 0;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case"-":
                result = first - second;
                break;
            case"*":
                result = first * second;
                break;
            case"/":
                result = first / second;
                break;
            default:
                System.out.println("Invalid Operator.");
                return;
        }

        System.out.println(result);
    }
}
