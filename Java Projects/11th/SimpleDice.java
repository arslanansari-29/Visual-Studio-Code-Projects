import java.util.Scanner;

public class SimpleDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = (int)Math.floor((Math.random()*10));
        while (n < 1 || n > 6) {
            n = (int)Math.floor((Math.random()*10));
        }
        System.out.print(n);
        scanner.close();
    }
}
