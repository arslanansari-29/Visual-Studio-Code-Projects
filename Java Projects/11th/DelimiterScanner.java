import java.util.Scanner;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class DelimiterScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String para = sc.nextLine();
        Scanner st = new Scanner(sc.nextLine());
        st.useDelimiter(".?!");
        while (st.hasNext()) {
            System.out.println(st.next().trim());
            
        }
        st.close();
        sc.close();
    }
}
