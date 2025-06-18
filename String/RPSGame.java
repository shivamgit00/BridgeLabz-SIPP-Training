import java.util.Scanner;

public class RPSGame {

    public static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "Rock" : r == 1 ? "Paper" : "Scissors";
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "Tie";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Scissors") && comp.equals("Paper")) ||
            (user.equals("Paper") && comp.equals("Rock")))
            return "User";
        return "Comp";
    }

    public static String[][] stats(int games, int userWins, int compWins) {
        double uw = userWins, cw = compWins;
        double uPerc = (uw / games) * 100;
        double cPerc = (cw / games) * 100;
        return new String[][] {
            {"UserWon", String.valueOf(userWins), String.format("%.2f%%", uPerc)},
            {"CompWon", String.valueOf(compWins), String.format("%.2f%%", cPerc)}
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int uw = 0, cw = 0;
        System.out.println("Game\tUser\tComp\tWinner");
        for (int i = 1; i <= n; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);
            if (win.equals("User")) uw++;
            if (win.equals("Comp")) cw++;
            System.out.printf("%d\t%s\t%s\t%s%n", i, user, comp, win);
        }

        String[][] s = stats(n, uw, cw);
        System.out.println("\nSummary:");
        for (String[] row : s)
            System.out.printf("%s: %s wins (avg %s)%n", row[0], row[1], row[2]);
    }
}
