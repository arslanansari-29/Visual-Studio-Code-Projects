import java.util.Scanner;
import java.util.StringTokenizer;

public class Snowball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine().trim();
        if(str.charAt(str.length()-1) != '.' && str.charAt(str.length()-1) != '?') {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT.");
            System.exit(0);
        }
        str=str.substring(0, str.length()-1);
        StringTokenizer tokenizer = new StringTokenizer(str);
        int wordCount = tokenizer.countTokens();
        String[] ar = new String[wordCount];
        for(int i = 0; i < wordCount; i++) {
            ar[i] = tokenizer.nextToken();
        }
        boolean f = false;
        for(int i=0; i<wordCount-1; i++) {
            if(ar[i+1].length()<ar[i].length()) {
                f = true;
                break;
            }  
        }
        System.out.print(f ? "It IS NOT A SNOWBALL STRING" : "IT IS A SNOWBALL STRING");
        scanner.close();
    }
}
