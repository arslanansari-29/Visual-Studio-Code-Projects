import java.util.Scanner;

public class AlphabeticSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().toUpperCase(), w="";
        for (char CH='A'; CH<='Z'; CH++) {
            for (int j = 0; j < line.length(); j++) {
                if(CH==line.charAt(j)) {
                    w += line.charAt(j);
                }
            }
        }
        System.out.println(w.trim());
        scanner.close();
    }
}
