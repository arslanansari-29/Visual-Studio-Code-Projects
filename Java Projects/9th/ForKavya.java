/*Write a program in java to take input a character,
if it is a lower case letter then convert it into
upper case and print it's ASCII code, else covert it in 
lower case and then print it's ASCII code.
a = 97, A = 65
z = 122, Z = 90*/
import java.util.Scanner;
public class ForKavya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            ch = (char)(ch-32);
            int x = ch;
            System.out.println("Upper case letter of entered character = "+ch);
            System.out.println("ASCII code of upper case letter: "+x);
        }
        else
        {
            ch = (char)(ch+32);
            int y = ch;
            System.out.println("Lower case letter of entered character = "+ch);
            System.out.println("ASCII code of lower case letter: "+y);
        }
        sc.close();
    }
}
