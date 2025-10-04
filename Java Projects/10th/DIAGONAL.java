import java.util.*;
public class DIAGONAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ar= new int[4][4];
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print("Enter a value: ");
                ar[i][j] = scanner.nextInt();
            }
        }
        int leftdiag=0,rightdiag=0;
        for(int i=0;i<4;i++) {
            leftdiag+=ar[i][i];
        }
        for(int i=0;i<4;i++) {
            rightdiag+=ar[i][3-i];
        }
        System.out.println(leftdiag==rightdiag?"DIAGONAL aaray":"Not a DIAGONAL array");
        scanner.close();
    }
}
