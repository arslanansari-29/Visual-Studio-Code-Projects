import java.util.Scanner;
import java.util.StringTokenizer;

public class string_tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer tokenizer = new StringTokenizer("Arslan Ansari Anshika Singh.");
        int count = tokenizer.countTokens();
        for(int i=0; i<count-1; i++) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println(tokenizer.hasMoreElements() ? "There are more tokens." : "No more tokens.");
        // Display the number of elements left in the tokenizer 
        System.out.println("Number of tokens left: " + tokenizer.countTokens());
        System.out.println("Token left: "+tokenizer.nextToken());
        scanner.close();
    }
}
