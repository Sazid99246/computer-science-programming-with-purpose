public class RGBtoYIQ {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double y = 0.299 * r + 0.587 * g + 0.114 * b;
        double i = 0.596 * r - 0.275 * g - 0.321 * b;
        double q = 0.212 * r - 0.523 * g + 0.311 * b;

        System.out.println("Y = " + y);
        System.out.println("I = " + i);
        System.out.println("Q = " + q);
    }
}
