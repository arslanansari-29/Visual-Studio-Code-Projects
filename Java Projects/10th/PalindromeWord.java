import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String st=scanner.next(), r="";
        for(int i=0; i<st.length(); i++) {
            r=st.charAt(i)+r;
        }
        System.out.println(st.equalsIgnoreCase(r)?"Palindrome Word":"Not a Palindrome Word");
        scanner.close();
    }
}
