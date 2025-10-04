 public class Codeium {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        int num = 1; // Variable to store the number

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(num++);
            }
            System.out.println();
        }
    }
} 
