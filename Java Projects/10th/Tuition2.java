public class Tuition2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            int a=1;
            for(int j=5;j>=1;j--) {
                if (j>i) {
                    System.out.print(" ");
                }
                else
                    System.out.print(a++);
            }
            System.out.println();
        }
    }
}
