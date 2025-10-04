import java.util.Scanner;

public class alpha_seq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine(),w="";
        for(char ch='A'; ch<='Z'; ch++) {
            for(int i=0; i<word.length(); i++) {
                if(ch==word.charAt(i)) {
                    w=w+word.charAt(i);
                }
            }
        }
        System.out.println(w);
        scanner.close();
    }
}
