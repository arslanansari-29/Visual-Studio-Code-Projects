public class Pattern014_2 {

    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            int a=4;
            for(int j=4; j>=1; j--) {
                if (j>i)
                    System.out.print(" ");
                else if(j<=i)
                    System.out.print(a--%2==0?1:0);
            }
            System.out.println();
        }
    }
}