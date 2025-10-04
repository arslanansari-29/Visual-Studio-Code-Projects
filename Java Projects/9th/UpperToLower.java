import java.util.Scanner;
public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an upper case letter");
        char a = sc.next().charAt(0);
        a = (char)(a+32);
        System.out.println("Lower case letter of entered letter = "+a);
        sc.close();
    }
}
