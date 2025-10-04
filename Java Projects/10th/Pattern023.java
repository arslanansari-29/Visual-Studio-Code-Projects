public class Pattern023 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1; i<=4; i++) {    
            for(int j=1; j<=4; j++)
                System.out.print(j>=i?a+++"\t":" \t");
            System.out.println();
        }
    }
}
