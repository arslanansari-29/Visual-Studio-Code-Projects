public class Practice {
    public static void main(String[] args) {
        int rows = 5;
        int maxNumber = 15;
        int number = 1;

        // Calculate the maximum number of digits in the last row
        int maxDigits = String.valueOf(maxNumber).length();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }

            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                // Print the number with formatting
                System.out.printf("%" + maxDigits + "d ", number);
                number++; // Increment the number
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
