import java.util.Scanner;

public class tuition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int n=scanner.nextInt(),
        int a=0;
        for (int i=0; i<=4;i++)
        {
            a=i;
            for(int j=0;j<=i;j++)
            {
                System.out.print(a++);
            }
            System.out.println();
        }
        scanner.close();
    }
}
