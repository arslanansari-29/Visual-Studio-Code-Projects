import java.util.*;
public class pin_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int[] ar= {110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033};
        System.out.println(ar[sc.nextInt()-1]);
        sc.close();
    }
}
