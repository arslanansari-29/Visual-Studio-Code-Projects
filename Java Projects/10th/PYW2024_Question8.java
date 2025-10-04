import java.util.*;
public class PYW2024_Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a gmail: ");
        String gmail = scanner.nextLine();
        System.out.println(gmail.endsWith("@gmail.com"));
        scanner.close();
    }
}
