 public class Pattern016 {
    public static void main(String[] args) {
        for (int i=1;i<=4; i++) {
            for(int j=4; j>=1; j--)
                System.out.print(j>i?" ":i);
            System.out.println();
        }
    }
}
