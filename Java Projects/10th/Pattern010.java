public class Pattern010 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=5; j>=1; j--) {
                System.out.print(j>i?" ":j);
            }
            System.out.println();
        }
    }
}
