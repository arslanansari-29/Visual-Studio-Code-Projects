import java.util.Scanner;

public class Series01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=scanner.nextInt(),r=0;
        for(int i =1; i<=n; i++) {
            r=r*10+1;
            System.out.print(r+", ");
        }
        scanner.close();
    }
}
