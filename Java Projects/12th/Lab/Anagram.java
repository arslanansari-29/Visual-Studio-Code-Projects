import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().trim().toLowerCase();
        System.out.print("OUTPUT: ");
        if(!valid(s1) || !valid(s2)) {
            System.out.println("INVALID CHARACTERS IN STRING. INVALID INPUT.");
            sc.close();
            return;
        }
        boolean f=true;
        for(char ch = 'a'; ch<='z'; ch++) {
            int c1 = 0, c2 = 0;
            for(int i=0; i<s1.length(); i++) {
                if(ch == s1.charAt(i))
                    c1++;
            }
            for(int i=0; i<s2.length(); i++) {
                if(ch== s2.charAt(i))
                    c2++;
            }
            if(c1 != c2) {
                f=false;
                break;
            }
        }
        System.out.println(f?"STRINGS ARE ANAGRAMS":"STRINGS ARE NOT ANAGRAMS");
        sc.close();
    }

    public static boolean valid(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isWhitespace(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }
}