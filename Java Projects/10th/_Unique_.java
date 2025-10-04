import java.util.Scanner;

public class _Unique_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        boolean f=false;
        for (int i = 0; i <=9; i++) {
            int c=n, k=0;
            while (c!=0) {
                int d=c%10;
                if(d==i) {
                    k++;
                    if(k==2) {
                        f=true;
                        break;
                    }
                }
                c/=10;
            }
        }
        System.out.println(f==true?"Not Unique":"Unique");
        scanner.close();
    }
}