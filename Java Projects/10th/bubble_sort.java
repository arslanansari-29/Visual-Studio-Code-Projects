import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five numbers");
        int[] ar = new int[5];
        System.out.println("Unsorted array: ");
        for(int i=0; i<ar.length; i++) {
            System.out.print("Enter a number: ");
            ar[i] = scanner.nextInt();
        }
        for(int i=0; i<ar.length-1; i++) {
            for( int j=0; j<ar.length-i-1; j++) {
                if(ar[j]>ar[j+1]) {
                    int t= ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<ar.length; i++)
            System.out.print(ar[i]+", ");
        scanner.close();
    }
}
