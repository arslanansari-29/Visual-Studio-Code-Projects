import java.util.Scanner;

public class Splitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word in lowercase: ");
        String word = scanner.next();
        scanner.close();
        System.out.print(word.length()%2==0?word.substring(word.length()/2)+word.substring(0, word.length()/2):word.substring(word.length()/2+1)+word.charAt(word.length()/2)+word.substring(0, word.length()/2));
    }
}
