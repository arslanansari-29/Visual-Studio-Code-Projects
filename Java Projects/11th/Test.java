import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name or Cipher Text:");
        String str = sc.nextLine(), w = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='M' || ch>='a' && ch<='m')
                w+=(char)(ch+13);
            else if(ch>='N' && ch<='Z' || ch>='n' && ch<='z')
                w+=(char)(ch-13);
            else
                w+=ch;
        }
        System.out.println(w);
        sc.close();
    }
}
