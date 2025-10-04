import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        String[] choice = {"Rock", "Paper", "Scissor"};
        System.out.println(choice[random.nextInt(0,3)]);
    }
}
