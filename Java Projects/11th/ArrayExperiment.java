import java.util.Scanner;

public class ArrayExperiment {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Single-Dimensional Array:-
            // Syntax of declaing an array:
            int[] ar0; int ar1[];
            // System.out.println(ar);
                               // ^^ This will give a null pointer exception because ar is not initialized yet.
            // Syntax for initializing the size of an array:
            ar0 = new int[5]; // This will create an array of size 5.
            System.out.println(ar0); // This will print the base address of the array.
            // Syntax for initializing the values of an array:
            // ar[0] = 10;
            for(int i = 0; i < ar0.length; i++) {
                ar0[i] = i + 1; // This will assign values to the array.
                System.out.print(ar0[i] + ", "); // This will print the values of the array.
            }
            System.out.println();
            // Syntax for Declaring and Initializing an array with legal default values in one line:
            int[] ar2 = new int[10];
            // Syntax for Declaring and Initializing an array with values in one line:
            int[] ar3 = {1, 2, 3, 4, 5};
        scanner.close();
    }
}
