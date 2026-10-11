import java.util.Scanner;
public class Pendulum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT:\nN: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                int temp = a[i];
                for (int j = i; j > 0; j--)
                    a[j] = a[j - 1];
                a[0] = temp;
            }
        }
        System.out.print("OUTPUT: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
}