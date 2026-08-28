import java.util.*;

public class Prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String w = sc.next().trim().toUpperCase();
        int n = w.length();
        System.out.print("OUTPUT: ");
        if (n <= 0 || n > 9) {
            System.out.println("INVALID INPUT");
            sc.close();
            return;
        }
        int total = (int)Math.pow(n, n);
        int count = 0;
        for (int i = 0; i < total; i++) {
            int[] a = new int[n];
            int temp = i;
            for (int j = n - 1; j >= 0; j--) {
                a[j] = temp % n;
                temp = temp / n;
            }
            boolean f = true;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[j] == a[k]) {
                        f = false;
                        break;
                    }
                }
                if (!f) break;
            }
            if (f) {
                String word = "";
                for (int j = 0; j < n; j++)
                    word += w.charAt(a[j]);
                System.out.print(word + " ");
                count++;
                if(count % 8 == 0) System.out.println();
            }
        }
        System.out.println("\nTotal number of combinations = " + count);
        sc.close();
    }
}