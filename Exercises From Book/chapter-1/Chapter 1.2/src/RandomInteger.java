public class RandomInteger {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int randInt = (int)(Math.random() * (b - a + 1)) + a;

        System.out.println(randInt);
    }
}
