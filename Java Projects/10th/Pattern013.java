public class Pattern013 {
    public static void main(String[] args) {
        int s=3;
        for (int i=1; i<=4; i++) {    
            for (int k=1; k<=s; k++)
                System.out.print(" ");
            for (int j=i; j>=1; j--)
                System.out.print(j%2==0?0:1);
            System.out.println();
            s--;
        }
    }
}
