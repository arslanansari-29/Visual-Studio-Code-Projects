import java.util.*;
public class CharOfASCII 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        char ch = (char) a;
        System.out.println("Corresponding character = "+ch);
        sc.close();    
    }    
}
