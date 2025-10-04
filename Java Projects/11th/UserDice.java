import java.util.Scanner;

public class UserDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of faces of dice: ");
        int f = scanner.nextInt(), k=0, c=f;
        while (c !=0 ) {
            k++;
            c/=10;
        }
        int n = (int)Math.floor((Math.random()*Math.pow(10, k)));
        while (n < 1 || n > f) {
            n = (int)Math.floor((Math.random())*Math.pow(10, k));
        }
        System.out.print(n);
        scanner.close();
    }
}
