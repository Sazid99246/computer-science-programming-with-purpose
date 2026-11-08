import static java.lang.Math.*;

public class RandomGaussian {
    public static void main(String[] args) {
        System.out.println(sin(2 * PI * random()) * sqrt(-2 * log(random())));
    }
}
