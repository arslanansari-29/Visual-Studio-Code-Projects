import java.util.Scanner;
import java.util.StringTokenizer;

public class AlphabeticWordArrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INPUT: ");
        String st = scanner.nextLine().toUpperCase().trim();
        System.out.print("OUTPUT: ");
        if(st.charAt(st.length()-1)!='.' && st.charAt(st.length()-1)!='?' && st.charAt(st.length()-1)!='!') {
            System.out.print("INVALID SENTENCE");
            System.exit(0);
        }
        st=st.substring(0, st.length()-1);
        StringTokenizer tokenizer = new StringTokenizer(st);
        int wordcount = tokenizer.countTokens();
        String[] ar = new String[wordcount];
        for(int i=0; i<wordcount; i++) {
            ar[i] = tokenizer.nextToken();
        }
        for(int i=0; i<wordcount-1; i++) {
            for(int j=i+1; j<wordcount; j++) {
                if(ar[i].compareTo(ar[j])>0) {
                    String temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println("LENGTH = "+wordcount);
        System.out.println("REARRANGED SENTENCE");
        for(int i=0; i<wordcount; i++) {
            System.out.print(ar[i]+" ");
        }
        scanner.close();
    }
}
