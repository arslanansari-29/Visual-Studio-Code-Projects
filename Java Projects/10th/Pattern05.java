public class Pattern05 {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print(i==1||i==5||i+j==6?"* ":"  ");
            }
            System.out.println();
        }
    }
}
