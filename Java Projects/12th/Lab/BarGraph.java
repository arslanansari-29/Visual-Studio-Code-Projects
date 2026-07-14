import java.util.Scanner;
class BarGraph{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT: ");
        String s = in.nextLine().toUpperCase();
        char last = s.charAt(s.length() - 1);
        if(".?!".indexOf(last) == -1){
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
            System.exit(0);
        }
        System.out.println("OUTPUT: WORD\tCOUNT");
        String word = "";
        int v = 0;
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                word += ch;
                if("AEIOU".indexOf(ch) >= 0)
                    v++;
                else
                    c++;
            }
            else{
                System.out.print("\t"+word + "\t");
                for(int j = 1; j <= v; j++)
                    System.out.print("V");
                System.out.print("\n\t\t");
                for(int j = 1; j <= c; j++)
                    System.out.print("C");
                System.out.println();
                v = 0;
                c = 0;
                word = "";
            }
        }
        in.close();
    }
}
