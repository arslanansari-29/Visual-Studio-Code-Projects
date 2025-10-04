import java.util.Scanner;
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower case letter");
        char a = sc.next().charAt(0);
        a = (char)(a-32);
        System.out.println("Upper case letter of entered letter = "+a);
        sc.close();
    }
}
