import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(reverse);
    }
}
