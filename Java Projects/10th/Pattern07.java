public class Pattern07 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) 
                System.out.print(a++ +"\t");
            System.out.println();
        }
    }
}
