import java.util.Scanner;

public class first_cap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine()+" ",t="",w="";
        for(int i=0; i<sentence.length(); i++) {
            char ch=sentence.charAt(i);
            if(ch!=' ') {
                if(w.length()==0)
                    ch=Character.toUpperCase(ch);
                w+=ch;
            }
            else {
                t=t+" "+w;
                w="";
            }
        }
        System.out.println(t);
        scanner.close();
    }
}

