public class Pattern17 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop through each column
            for (int j = 1; j <= columns; j++) {
                // Check if it's the first or last row/column or diagonals
                if (i == 1 || i == rows || j == 1 || j == columns || i == j || j == columns - i + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t"); // Print empty space for inner cells
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
