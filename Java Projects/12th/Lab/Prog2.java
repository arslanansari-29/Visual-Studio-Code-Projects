import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String s = sc.nextLine();
        if(".!?".indexOf(s.charAt(s.length()-1))==-1) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        // System.out.println("Its there");
        for(char ch = 'a'; ch<='z'; ch++) {
            
        }
    }
}
