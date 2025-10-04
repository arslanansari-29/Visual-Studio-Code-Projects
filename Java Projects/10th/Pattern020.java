public class Pattern020 {
    public static void main(String[] args) {
        for(int i=4; i>=1; i--) {
            for(int j=4; j>=1; j--)
                System.out.print(j<=i?j:" ");
            System.out.println();
        }
    }
}
