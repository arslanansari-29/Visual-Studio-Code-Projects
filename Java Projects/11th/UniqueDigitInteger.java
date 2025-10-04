import java.util.Scanner;

public class UniqueDigitInteger {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("OUTPUT: ");
        if(m<n) {
            System.out.println("The Unique-Digit integers are:");
            int count = 0;
            for (int i = m; i <= n; i++) {
                int num = i;
                boolean digits[] = new boolean[10];
                boolean isUnique = true;
                while (num != 0) {
                    int d = num % 10;
                    if (digits[d]) {
                        isUnique = false;
                        break;
                    }
                    digits[d] = true;
                    num /= 10;
                }
                if (isUnique) {
                    count++;
                    System.out.print(count==1?i:", " + i);
                }
            }
            System.out.println();
            System.out.println("Frequency of unique-digit integers is: " + count);   
            sc.close();
        }
        else{
            System.out.println("The Unique-Digit integers are: NIL"+"\n"+"Frequency of unique-digit integers is: 0" );
        }
    }
}