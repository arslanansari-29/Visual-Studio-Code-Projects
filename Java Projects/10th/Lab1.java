import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:-\nPattern 1:\tPattern 2:\n1 1 1 1 1\t* * * * *\n2 2 2 2 2\t* *     *\n3 3 3 3 3\t*   *   *\n4 4 4 4 4\t*     * *\n5 5 5 5 5\t* * * * *\nEnter your choice");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i == 1 || i == 5 || j == 1 || j == 5 || i==j)
                            System.out.print("* ");

                        else
                            System.out.print("  ");
                    }
                    System.out.println();
                }
                break;
                default:
                System.out.println("Wrong input");
        }
        scanner.close();
    }
}
