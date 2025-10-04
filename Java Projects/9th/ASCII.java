import java.util.Scanner;
public class ASCII 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int a = ch;
        System.out.println("ASCII code = "+a);
        sc.close();
    }    
}
