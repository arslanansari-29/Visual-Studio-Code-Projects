import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print(random.nextBoolean() ? "Heads" : "Tails");
    }
}
