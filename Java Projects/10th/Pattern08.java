public class Pattern08 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            int a=1;
            char b='A';
            for(int j=5; j>=1; j--) {
                if (j<i) 
                    System.out.print(a++);
                else
                    System.out.print(b++);
            }
            System.out.println();
        }
    }
}
