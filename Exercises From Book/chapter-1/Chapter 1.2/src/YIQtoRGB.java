public class YIQtoRGB {
    public static void main(String[] args) {
        double y = Double.parseDouble(args[0]);
        double i = Double.parseDouble(args[1]);
        double q = Double.parseDouble(args[2]);

         double r = y + 0.956 * i + 0.621 * q;
         double g = y - 0.272 * i - 0.647 * q;
         double b = y - 1.106 * i + 1.703 * q;

        System.out.println("R = " + r);
        System.out.println("G = " + g);
        System.out.println("B = " + b);
    }
}
