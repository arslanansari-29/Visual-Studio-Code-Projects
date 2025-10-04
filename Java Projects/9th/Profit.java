import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price value");
        int cp = sc.nextInt();
        System.out.println("Enter selling price value");
        int sp = sc.nextInt();
        if(cp<sp)
        {
            int p = sp-cp;
            System.out.println("Profit = "+p);
        }
        else
        {
            int l = cp-sp;
            System.out.println("Loss = "+l);
        }
        sc.close();
    }
}
