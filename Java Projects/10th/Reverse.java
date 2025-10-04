import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().trim()+" ",w="",t="";
        for(int i=0;i<line.length();i++) {
            char ch=line.charAt(i);
            if(ch!=' ')
                w=ch+w;
            else {
                t+=w+" ";
                w="";
            }
        }
        System.out.print(t);
        scanner.close();
    }
}
