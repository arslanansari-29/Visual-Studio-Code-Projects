import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Menu\n1- Print series\n2- Print Pattern\nEnter your choice");
            int k = scanner.nextInt();
            int a = 0, b=1, n=0;
            switch (k) {
                case 1: {
                    System.out.println("Enter number of terms");
                    n = scanner.nextInt();
                    for(int i=1; i<=n; i++) {
                        System.out.print(a+", ");
                        int c=a+b;
                        a=b;
                        b=c;
                    }
                }
                case 2: {
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("1");
                        }
                        System.out.println();
                    }
                }
                default: System.out.println("Wrong input");
            }
        }
    }
}
