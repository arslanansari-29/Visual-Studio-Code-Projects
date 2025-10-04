import java.util.Scanner;

public class Digits_frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        System.out.println("Digit\tFrequency");
        for (int i = 0; i<=9; i++) {
            int c=n, k=0;
            while (c!=0) {
                int d=c%10;
                if (d==i)
                    k++;
                c/=10;
            }
            if (k!=0)
                System.out.println(i+"\t"+k);
        }
        scanner.close();
    }
}
