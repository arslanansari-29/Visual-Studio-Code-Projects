import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();
        System.out.print("Enter a character: ");
        char ch=scanner.next().charAt(0);
        int k = 0;
        for(int i=0; i<line.length(); i++) {
            if(line.charAt(i)==ch)
                k++;
        }
        System.out.println("Number of \'"+ch+"\' in line: "+k);
        scanner.close();
    }
}
