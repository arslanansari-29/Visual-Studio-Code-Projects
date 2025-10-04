public class Tuition1 {
    public static void main(String[] args) {
        int rows = 5;

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop through each column
            for (int j = 1; j <= rows; j++) {
                if (j < i) {
                    System.out.print(" "); // Print spaces for indentation
                } else {
                    System.out.print(j + ""); // Print numbers in the current row
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
