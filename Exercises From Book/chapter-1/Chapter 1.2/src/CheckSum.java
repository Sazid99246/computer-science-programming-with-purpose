public class CheckSum {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println(!(n1 >= n2 + n3 ||
                             n2 >= n1 + n3 ||
                             n3 >= n1 + n2));
    }
}
