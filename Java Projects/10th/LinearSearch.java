import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = new int[10];
        for(int i = 0; i < ar.length; i++) {
            System.out.print("Enter a value: ");
            ar[i] = scanner.nextInt();
        }
        System.out.print("Enter a number: ");
        int target = scanner.nextInt(),p=0;
        boolean f=false;
        for(int i=0; i<ar.length; i++) {
            if(ar[i]==target) {
                p = i+1;
                f=true;
                break;
            }
            // else
            //     f=true;
        }
        System.out.print(f?"Position: "+p:"Number not found");
        scanner.close();
    }
}
