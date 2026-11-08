public class Stats5 {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
        double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
        double average = (n1 + n2 + n3 + n4 + n5) / 5;

        System.out.println("Average = " + average);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
    }
}
