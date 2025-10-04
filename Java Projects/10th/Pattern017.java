public class Pattern017 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            for(int j=4; j>=1; j--)
                if (j>i)
                    System.out.print(" ");
                else
                    System.out.print(i%2==0?0:1);
            System.out.println();
        }
    }
}
