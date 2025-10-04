import java.util.Scanner;

public class WordLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().trim()+" ",w="";
        int k = 0;
        for(int i=0; i<line.length(); i++) {
            char ch=line.charAt(i);
            if(ch!=' ') {
                k++;
                w+=ch;
            }
            else {
                System.out.println(w+" has "+k+" letters");
                w="";
                k=0;
            }
        }
        scanner.close();
    }
}
