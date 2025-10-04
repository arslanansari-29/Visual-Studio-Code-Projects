import java.util.*;

public class AscendingNotDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar =new int[5];
        System.out.println("Enter 5 numbers");
        System.out.print("Enter a number: ");
        ar[0] = sc.nextInt();
        for(int i=1; i<ar.length; i++) {
            System.out.print("Enter a number: ");
            ar[i] = sc.nextInt();
            for(int j=0; j<=i-1; j++) {
                if(ar[i]==ar[j]) {
                    System.out.println("Duplicate number"); 
                    i--;
                }
                if(ar[i]<ar[j]) {
                    int t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        sc.close();
    }
}
