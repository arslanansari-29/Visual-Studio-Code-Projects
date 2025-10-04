import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu\n1- Pattern1\n2- Pattern2\nEnter your choice");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                for (char i = 'A'; i <= 'D'; i++) {
                    for (char j = 'A'; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 4; i >= 1; i--) {
                    for (int j = i; j >= 1; j--) {
                        System.out.print("1");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        scanner.close();
    }
}
