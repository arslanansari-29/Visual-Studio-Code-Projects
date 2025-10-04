public class Pattern2 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
