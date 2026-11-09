public class KthRoot {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        if (k <= 0 || (n < 0 && k % 2 == 0)) {
            System.out.println("Invalid input");
            return;
        }

        if (n == 0 || k == 1) {
            System.out.println(n);
            return;
        }

        double t = n;

        while (true) {
            double next = ((k - 1) * t
                    + n / Math.pow(t, k - 1)) / k;

            if (Math.abs(next - t) < 1e-10) {
                break;
            }

            t = next;
        }

        System.out.println(t);
    }
}
