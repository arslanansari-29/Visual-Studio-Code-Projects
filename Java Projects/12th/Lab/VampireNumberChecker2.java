import java.util.Scanner;
public class VampireNumberChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INPUT\nNumber: ");
        String str = scanner.next();
        long n = Long.parseLong(str);
        if (str.length() % 2 != 0) {
            System.out.println("INVALID!! Please input even digits number");
            return;
        }
        long start = (long)Math.pow(10, str.length()/2-1), end = start * 10 - 1;
        boolean found = false;
        for (long i = start; i <= end; i++) {
            if (n % i != 0) 
                continue;
            for (long j = n / i; j <= n / i; j++) {
                if (j < i || j > end || (i % 10 == 0 && j % 10 == 0)) 
                    continue;
                if (checkDigits(str, String.valueOf(i) + String.valueOf(j))) {
                    if (!found) 
                        System.out.println(n + " is a Vampire number\nCombination:");
                    System.out.println(Long.parseLong(String.valueOf(i)) + " X " + Long.parseLong(String.valueOf(j)));
                    found = true;
                }
            }
        }
        if (!found) System.out.println(n + " is not a Vampire number");
    }
    private static boolean checkDigits(String s1, String s2) {
        boolean[] used = new boolean[s1.length()];
        for (int i = 0; i < s2.length(); i++) {
            boolean match = false;
            for (int k = 0; k < s1.length(); k++) {
                if (!used[k] && s1.charAt(k) == s2.charAt(i)) {
                    used[k] = match = true;
                    break;
                }
            }
            if (!match) return false;
        }
        return true;
    }
}