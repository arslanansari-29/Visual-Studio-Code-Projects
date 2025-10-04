import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Menu\n1- Pattern 1\n2- Pattern 2\nEnter your choice");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (j%2==0) {
                                System.out.print("0");
                            }
                            else
                                System.out.print("1");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 4; i>=1; i--) {
                        for(int j = 1; j<=i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
