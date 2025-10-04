import java.util.Random;
public class DiceWindsurf {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1; // Generates a random number between 1 (inclusive) and 6 (inclusive)
        System.out.println(randomNumber);
    }
}
