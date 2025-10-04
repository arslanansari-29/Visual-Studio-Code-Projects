public class Pattern022 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            int a=1;
            for(int j=1; j<=4; j++) {
                if(j>=i)
                    System.out.print(a++%2==0?0:1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
