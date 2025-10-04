import java.util.Scanner;

public class alpha_freq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int k=0; char Y='a';
        for(char ch = 'A'; ch <='Z'; ch++) {
            int c=0;
            for(int i=0; i<sentence.length(); i++) {
                if(ch==sentence.charAt(i))
                    c++;   
            }
            if(c>k) {
                k=c;
                Y=ch;
            }
        }
        System.out.println("Freq: " +k+"\nAlpha: "+Y);
        scanner.close();
    }
}
