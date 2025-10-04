import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st=scanner.nextLine();
        int d=0, u=0, l=0, w=0, s=0;
        for(int i=0; i<st.length(); i++) {
            char ch=st.charAt(i);
            if(Character.isUpperCase(ch))
                u++;
            else if(Character.isLowerCase(ch))
                l++;
            else if(Character.isDigit(ch))
                d++;
            else if(ch==' ')
                w++;
            else 
                s++;
        }
        System.out.println("Digits = "+d+"\n"+"Uppercase = "+u+"\n"+"Lowercase = "+l+"\n"+"White space = "+w+"\n"+"Special symbols = "+s);
        scanner.close();
    }
}
