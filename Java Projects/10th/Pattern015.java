public class Pattern015 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1; i<=4; i++) {
            for(int j=4; j>=1; j--) 
                System.out.print(j>i?" \t":a++ +"\t");
            System.out.println();
        }
    }
    
}
