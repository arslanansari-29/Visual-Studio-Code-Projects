import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int[] ar = new int[scanner.nextInt()];
        for(int i = 0; i < ar.length; i++) {
            System.out.print("Enter a number: ");
            ar[i] = scanner.nextInt();
        }
        System.out.println("Array before sorting: ");
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
        System.out.println("Array after sorting: ");
        for(int i = 1; i<ar.length; i++) {
            int current = ar[i];
            int j = i - 1;
            while(j >= 0 && ar[j] > current) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = current;
        }
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        scanner.close();
    }
}
