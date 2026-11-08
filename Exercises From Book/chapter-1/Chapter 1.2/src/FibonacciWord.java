public class FibonacciWord {
    public static void main(String[] args) {

        String f0 = "a";
        String f1 = "b";

        System.out.println("0: " + f0);
        System.out.println("1: " + f1);

        for (int i = 2; i <= 10; i++) {

            String f2 = f1 + f0;

            System.out.println(i + ": " + f2);

            f0 = f1;
            f1 = f2;
        }
    }
}
