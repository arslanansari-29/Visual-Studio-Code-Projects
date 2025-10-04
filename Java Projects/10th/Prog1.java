import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int k=0;
        for(int i=0; i<sentence.length(); i++) {
            char ch=sentence.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1)
                k++;
        }
        System.out.println(k);
        scanner.close();
    }
}
