import java.util.Scanner;

public class Weight {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar=new int[5];
        for(int i=0; i<ar.length; i++) {
            System.out.print("Enter a weight: ");
            ar[i]=scanner.nextInt();
        }
        int k=ar[0],p=0;
        for(int i=0; i<ar.length; i++) {
            if(k>ar[i])
                k=ar[i];
            }
        System.out.println();
        scanner.close();
    }
}
