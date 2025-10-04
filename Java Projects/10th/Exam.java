import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String st = scanner.nextLine().toLowerCase().trim()+" ";
        String t="", w="";
        for(int i=0; i<st.length(); i++) {
            char ch=st.charAt(i);
            if(ch != ' ') {
                if(w.length() == 0)
                    ch = Character.toUpperCase(ch);
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
