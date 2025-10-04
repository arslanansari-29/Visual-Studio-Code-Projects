import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] ar = new int[5];
        for(int i=0; i<5; i++) {
            ar[i] = rand.nextInt(1, 100);
        }
        for(int i=0 ; i<ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        // rand.equals(ar);
        System.out.println();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(numbers);
    }
}
