
public class Kary {
    public static void main(String[] args) {

        // Read the command-line arguments
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        // Check whether the base is valid
        if (k < 2 || k > 16) {
            System.out.println("Invalid base");
            return;
        }

        // Handle zero separately
        if (n == 0) {
            System.out.println(0);
            return;
        }

        // Characters representing digits in bases 2 through 16
        String digits = "0123456789ABCDEF";

        // Store the converted digits
        StringBuilder result = new StringBuilder();

        // Convert decimal n to base k
        while (n > 0) {
            int remainder = n % k;

            result.append(digits.charAt(remainder));

            n /= k;
        }

        // Reverse the digits and print the result
        System.out.println(result.reverse());
    }
}
