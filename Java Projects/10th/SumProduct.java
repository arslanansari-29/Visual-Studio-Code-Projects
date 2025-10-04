import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar=new int[6];
        int s=0,p=1;
        for(int i=0; i<ar.length; i++) {
            System.out.print("Enter a value: ");
            ar[i]=scanner.nextInt();
            if(ar[i]%2==0) 
                s+=ar[i];
            else 
                p*=ar[i];
        }
        System.out.print("Sum: "+s+"\nProduct: "+p);
        scanner.close();
    }
}
