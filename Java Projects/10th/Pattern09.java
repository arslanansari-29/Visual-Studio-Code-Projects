public class Pattern09 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            int a=1;
            for(int j=4; j>=1; j--) {
                System.out.print(j>i?" ":a++);
            }
            System.out.println();
        }
    }
}
