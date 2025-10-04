public class Pattern09_2 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            for (int j=4; j>=1; j--) {
                if(j>i) 
                    System.out.print(" ");
                else
                    System.out.print(Math.abs(j-(i+1)));
            }
            System.out.println();
        }
    }
}
