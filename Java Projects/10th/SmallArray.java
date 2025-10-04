import java.util.Scanner;

public class SmallArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = {10,23,45,6,9,-7,0,11};
        int k=ar[0],p=0;
        for(int i=0;i<ar.length;i++) {
            if(k>ar[i]) {
                k=ar[i];
                p=i+1;
            }
        }
        System.out.println("Smallest element is: "+k+"\nPosition: "+p);
        scanner.close();
    }
}
