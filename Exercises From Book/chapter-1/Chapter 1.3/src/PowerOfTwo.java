public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            if (Math.pow(2, i) <= n) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
