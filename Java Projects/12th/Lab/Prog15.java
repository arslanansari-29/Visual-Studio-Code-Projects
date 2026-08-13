import java.util.*;
class Prog15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String s = sc.nextLine().toUpperCase();
        char ch = s.charAt(s.length() - 1);
        if (ch != '.' && ch != '?' && ch != '!')
        {
            System.out.println("INVALID INPUT");
            sc.close();
            return;
        }
        s = s.substring(0, s.length() - 1);
        StringTokenizer st = new StringTokenizer(s);
        String sentence = "";
        while (st.hasMoreTokens())
            sentence = sentence + st.nextToken() + " ";
        sentence = sentence.trim();
        System.out.print("WORD TO BE DELETED: ");
        String word = sc.next().toUpperCase();
        System.out.print("WORD POSITION IN THE SENTENCE: ");
        int pos = sc.nextInt();
        st = new StringTokenizer(sentence);
        String result = "";
        int count = 0;
        boolean found = false;
        while (st.hasMoreTokens())
        {
            String temp = st.nextToken();
            count++;
            if (count == pos)
            {
                String check = temp;
                char last = check.charAt(check.length() - 1);
                if (last == ',')
                    check = check.substring(0, check.length() - 1);
                if (check.equals(word))
                {
                    found = true;
                    if (last == ',')
                        result = result + ", ";
                    continue;
                }
            }
            result = result + temp + " ";
        }
        System.out.print("OUTPUT: ");
        if (found)
            System.out.print(result.trim() + ch);
        else
            System.out.print(sentence + ch);
        sc.close();
    }
}