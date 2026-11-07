public class SinAndCos {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);

        double radians = Math.toRadians(theta);

        System.out.println(Math.sin(radians) + Math.cos(radians));
    }
}
