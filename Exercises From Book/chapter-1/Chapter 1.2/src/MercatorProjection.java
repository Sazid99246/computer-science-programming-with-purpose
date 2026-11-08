public class MercatorProjection {
    public static void main(String[] args) {

        double lambda0 = Double.parseDouble(args[0]);
        double phi = Double.parseDouble(args[1]);
        double lambda = Double.parseDouble(args[2]);

        double x = lambda - lambda0;

        double sinPhi = Math.sin(phi);

        double y = 0.5 * Math.log((1 + sinPhi) / (1 - sinPhi));

        System.out.println("(" + x + "; " + y + ")");
    }
}
