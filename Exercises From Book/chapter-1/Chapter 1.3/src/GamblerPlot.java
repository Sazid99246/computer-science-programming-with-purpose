public class GamblerPlot {

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);

        int cash = stake;

        while (cash > 0 && cash < goal) {

            // Print current cash as asterisks
            for (int i = 0; i < cash; i++) {
                System.out.print("*");
            }

            System.out.println();

            // Place a bet
            if (Math.random() < 0.5) cash++;
            else                     cash--;
        }

        // Print the final bankroll
        for (int i = 0; i < cash; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
