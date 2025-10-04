import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        for(int i=0; i<word.length(); i++) {
            for(int j=0; j<=i; j++) 
                System.out.print(word.charAt(j));
            System.out.println();
        }
        scanner.close();
    }
}
