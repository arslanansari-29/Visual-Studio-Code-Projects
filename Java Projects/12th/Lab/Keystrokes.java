import java.util.Scanner;

public class Keystrokes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String w = sc.next().trim().toUpperCase();
        System.out.print("OUTPUT: ");
        for(int i=0; i<w.length(); i++) {
            if(!Character.isLetter(w.charAt(i))) {
                System.out.print("INVALID ENTRY");
                sc.close();
                return;
            }
        }
        int k = 0;
        String[] keys = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        for(int i=0; i<keys.length; i++) {
            for(int j=0; j<w.length(); j++) {
                k+=keys[i].indexOf(w.charAt(j)) + 1;
            }
        }
        System.out.println("Number of keystrokes = " + k);
        sc.close();
    }
}
