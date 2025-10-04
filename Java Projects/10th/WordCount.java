import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().trim()+" ";
        int wordCount = 0;
        for (int i=0; i<line.length(); i++) {
            char ch=line.charAt(i);
            if(ch==' ')
                wordCount++;
        }
        System.out.print("Number of words: " + wordCount);
        scanner.close();
    }
}
