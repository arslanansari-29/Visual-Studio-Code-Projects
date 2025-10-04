import java.util.*;
public class Lead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int c=n;
        int e=0, o=0;
        while (c!=0) {
            int d=c%10;
            if(d%2==0)
                e+=d;
            else
                o+=d;
            c/=10;
        }
        System.out.println(e==o?"LED number":"Not a LED number");
        // if (e==o) {
        //     System.out.println("LED number");
        // }
        // else
        // System.out.println("Not a LED number");
        scanner.close();
    }
}
