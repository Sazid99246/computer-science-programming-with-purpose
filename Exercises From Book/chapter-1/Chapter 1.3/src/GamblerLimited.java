public class GamblerLimited {

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int maxBets = Integer.parseInt(args[3]);

        int totalBets = 0;
        int wins = 0;
        int losses = 0;
        int timeouts = 0;
        int totalCash = 0;

        for (int t = 0; t < trials; t++) {

            int cash = stake;
            int bets = 0;

            while (cash > 0 && cash < goal && bets < maxBets) {

                bets++;
                totalBets++;

                if (Math.random() < 0.5) cash++;
                else                     cash--;
            }

            // Determine how the game ended
            if (cash == goal) wins++;
            else if (cash == 0) losses++;
            else                timeouts++;

            totalCash += cash;
        }

        // Print results
        System.out.println("Wins = " + wins);
        System.out.println("Losses = " + losses);
        System.out.println("Timeouts = " + timeouts);

        System.out.println("Percent of games won = "
                                   + 100.0 * wins / trials);

        System.out.println("Avg # bets = "
                                   + 1.0 * totalBets / trials);

        System.out.println("Expected ending cash = "
                                   + 1.0 * totalCash / trials);
    }
}
