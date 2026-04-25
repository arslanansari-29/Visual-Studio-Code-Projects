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
        if(valid(s1) && valid(s2)) {
            if(sort(s1).compareToIgnoreCase(sort(s2)) == 0)
                System.out.println("STRINGS ARE ANAGRAMS.");
            else 
                System.out.println("STRINGS ARE NOT ANAGRAMS.");
        } 
        else
            System.out.println("INVALID CHARACTERS IN STRING. INVALID INPUT.");
    }

    public static String sort(String str) {
        for(int i = 0; i < str.length() - 1; i++) {
            for(int j = 0; j < str.length() - i - 1; j++) {
                if(str.charAt(j) > str.charAt(j + 1)) {
                    char temp = str.charAt(j);
                    str = str.substring(0, j) + str.charAt(j + 1) + temp + str.substring(j + 2);
                }
            }
        }
        return str.trim();
    }

    public static boolean valid(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isWhitespace(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }
}
