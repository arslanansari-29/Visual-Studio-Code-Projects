import java.util.Scanner;

public class PosNegOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int[] ar= new int[scanner.nextInt()];
        for(int i=0; i<ar.length; i++) {
            System.out.print("Enter a number: ");
            int n=scanner.nextInt();
            if(n<0)
                ar[i] = n;
            else
                i--;
        }
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        scanner.close();
    }
}
