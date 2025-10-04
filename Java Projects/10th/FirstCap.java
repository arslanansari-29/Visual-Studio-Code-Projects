import java.util.Scanner;

public class FirstCap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().toLowerCase().trim()+" ", w="", t="";
        for (int i = 0; i < line.length(); i++) {
            char ch=line.charAt(i);
            if(ch!=' ') {
                if(w.length()==0)
                    ch=Character.toUpperCase(ch);
                w += ch;
            }
            else {
                t += " "+w;
                w = "";
            }
        }
        System.out.println(t);
        scanner.close();
    }
}
