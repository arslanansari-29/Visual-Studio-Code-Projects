public class print_number {
    public static void main(String[] args) {
        int n = 5; // Example input
        printNumbers(n);
    }
    static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }
}
