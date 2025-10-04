import java.util.Scanner;

public class PrimeAdamNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeAdamNumber ob = new PrimeAdamNumber();
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        int count = 0;
        if(m < 0 || n < 0 || m > n) {
            System.out.print("Invalid Input");
            System.exit(0);
        }
        System.out.println("THE PRIME ADAM INTEGERS ARE: ");
        for(int num = m; num<=n; num++) {
            int factor = 0;
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    factor++;
                }
            }
            if(factor == 2) {
                int sq_of_num = num * num;
                int rev_of_num = ob.Reverse(num);
                int sq_of_rev_num = ob.Reverse(rev_of_num * rev_of_num);
                if(sq_of_num == sq_of_rev_num) {
                    count++;
                    if(count == 1) 
                        System.out.print(num);
                    else
                        System.out.print(", " + num);
                }
            }
        }
        if(count == 0) 
            System.out.print("NIL");
        System.out.println("\nFREQUENCY OF PRIME ADAM INTEGERS ARE: " + count);
        scanner.close();
    }

    int Reverse(int n) {
        int rev=0;
        while(n!=0) {
            int d = n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
}
