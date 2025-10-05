import java.util.Scanner;
import java.util.StringTokenizer;
public class CommonWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String p = sc.nextLine().toUpperCase().trim();
        System.out.println("OUTPUT: ");
        char last = p.charAt(p.length() - 1);
        if(".?!".indexOf(last) == -1){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        StringTokenizer st = new StringTokenizer(p, ".?!");
        int count = st.countTokens();
        if(count != 2){
            System.out.println("INVALID PARAGRAPH");
            System.exit(0);
        }
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        StringTokenizer s = new StringTokenizer(s1, " ,");
        count = s.countTokens();
        String w1[] = new String[count];
        for(int i = 0; i < count; i++)
            w1[i] = s.nextToken();
        s = new StringTokenizer(s2, " ,");
        count = s.countTokens();
        String w2[] = new String[count];
        for(int i = 0; i < count; i++)
            w2[i] = s.nextToken();
        System.out.println("SENTENCE 1: " + w1.length);
        System.out.println("SENTENCE 2: " + w2.length);
        String common[] = new String[w1.length];
        for(int i = 0; i < common.length; i++)
            common[i] = new String();
        int index = 0;
        for(int i = 0; i < w1.length; i++){
            if(!(search(w1[i], common)) && search(w1[i], w2))
                common[index++] = w1[i];
        }
        System.out.print("COMMON WORDS: ");
        for(int i = 0; i < common.length; i++){
            if(common[i].length() > 0)
                System.out.print(common[i] + " ");
            else
                break;
        }
        System.out.println();
        sc.close();
    }
    public static boolean search(String w, String a[]){
        for(int i = 0; i < a.length; i++){
            if(w.equals(a[i]))
                return true;
        }
        return false;
    }
}