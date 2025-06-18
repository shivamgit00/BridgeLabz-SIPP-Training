import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + (int)(Math.random() * 90);
        }
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            out[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) out[i][1] = "false";
            else out[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return out;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr)
            System.out.printf("%-5s %s%n", row[0], row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of students
        int[] ages = generateAges(n);
        String[][] result = canVote(ages);
        display(result);
    }
}
