public class Pattern011 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            int a=4;
            for(int j=4; j>=1; j--)
                System.out.print(j>i?" ":a--);
            System.out.println();
        }
    }
}