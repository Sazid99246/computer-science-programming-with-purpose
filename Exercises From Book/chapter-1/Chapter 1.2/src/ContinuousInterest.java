public class ContinuousInterest {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double A = P * Math.exp(r * t);

        System.out.println(A);
    }
}
