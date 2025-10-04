public class Pattern021 {
    public static void main(String[] args) {
        for(int i=4; i>=1; i--) {
            int a=4;
            for(int j=4; j>=1; j--)
                System.out.print(j<=i?a--:" ");
            System.out.println();
        }
    }
}
