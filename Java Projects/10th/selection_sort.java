import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar= new int[5];
        System.out.print("Enter five numbers");
        for(int i=0; i<ar.length; i++) {
            System.out.print("Enter a number: ");
            ar[i] = scanner.nextInt();
        }

        scanner.close();
    }
}
