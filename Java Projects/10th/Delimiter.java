import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // String st=scanner.nextLine();
        scanner.useDelimiter(" ");
        // while (scanner.hasNext()) {
        //     String t="";
        //     char ch=scanner.hasNext().charAt(0);

        // }
        scanner.close();
    }
}
