public class StatsN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double uniformNumber = Math.random();
            System.out.println(uniformNumber);
            sum += uniformNumber;
        }

        System.out.println("Average = " + sum / n);
    }
}
