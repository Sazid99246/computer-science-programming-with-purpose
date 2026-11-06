
/* *****************************************************************************
 *  Name:              Sheikh Md. Sazidul Islam
 *  Coursera User ID:  123456
 *  Last modified:     November 6, 2026
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(a > 0 && b > 0 && c > 0 &&
                                   ((long) a * a + (long) b * b == (long) c * c ||
                                           (long) a * a + (long) c * c == (long) b * b ||
                                           (long) b * b + (long) c * c == (long) a * a));
    }
}
