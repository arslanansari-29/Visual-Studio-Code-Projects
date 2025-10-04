import java.util.Scanner;

public class EachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().trim()+" ",w="";
        // int wordCount = 0;
        for (int i=0; i<line.length(); i++) {
            char ch=line.charAt(i);
            if(ch!=' ')
                w+=ch;
            else {
                System.out.println(w);
                w="";
            }
        }
        scanner.close();
    }
}
