import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(),s=0;
        boolean f=false;
        for (int i=1; i<n; i++) {
            s+=i;
            if(s==n)
                f=true;
            else
                System.out.print(i+", ");
        }
        System.out.println(f==true?"Consecutive number":"Not a Consecutive number");
        scanner.close();
    }
}
