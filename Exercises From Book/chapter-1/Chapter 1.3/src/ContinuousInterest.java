public class ContinuousInterest {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);

        System.out.println("Year\tAmount");

        for (int t = 0; t <= 25; t++) {
            double A = P * Math.exp(r * t);

            System.out.println(t + "\t" + A);
        }
    }
}
