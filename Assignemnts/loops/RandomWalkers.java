/* *****************************************************************************
 *  Name:              Sheikh Md. Sazidul Islam
 *  Coursera User ID:  123456
 *  Last modified:     8/11/2026
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        long totalSteps = 0;

        for (int t = 0; t < trials; t++) {

            int x = 0;
            int y = 0;
            int steps = 0;

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
            }

            totalSteps += steps;
        }

        double average = (double) totalSteps / trials;

        System.out.println("average number of steps = " + average);
    }
}
