import java.util.Scanner;
class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String s = sc.nextLine().toLowerCase();
        System.out.print("OUTPUT: ");
        if(".?!".indexOf(s.charAt(s.length()-1)) == -1) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        int missing = 0;
        String m = "";
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(s.indexOf(ch) == -1){
                missing++;
                m += ch + " ";
            }
        }
        if(missing == 0)
            System.out.println("IT IS A PANGRAM");
        else if(missing == 1) {
            System.out.println("PANGRAMMATIC LIPOGRAM");
            System.out.println("MISSING: " + m);
        }
        else {
            System.out.println("NEITHER");
            System.out.println("MISSING: " + m);
        }
        sc.close();
    }
}