/* *****************************************************************************
 *  Name:              Sheikh Md. Sazidul Islam
 *  Coursera User ID:  123456
 *  Last modified:     8/11/2026
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(0, 0) ");

        while (Math.abs(x) + Math.abs(y) < r) {

            int direction = (int) (Math.random() * 4);

            if (direction == 0) {
                y++;
            }
            else if (direction == 1) {
                y--;
            }
            else if (direction == 2) {
                x++;
            }
            else {
                x--;
            }

            steps++;

            System.out.println("(" + x + ", " + y + ") ");
        }

        System.out.println();
        System.out.println("steps = " + steps);
    }
}
