import java.util.*;

public class Prog19
{
    static int count = 0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        String N = sc.next().trim().toUpperCase();
        if(N.length() > 9)
        {
            System.out.print("OUTPUT: INVALID INPUT");
            sc.close();
            return;
        }
        char ch[] = new char[N.length()];
        for(int i = 0; i < N.length(); i++)
            ch[i] = N.charAt(i);
        System.out.println("OUTPUT: ");
        int A[] = new int[N.length()];
        for(int i = 0; i < A.length; i++)
            A[i] = i;
        anagram(ch, A, 0);
        sc.close();
    }

    public static void anagram(char ch[], int A[], int s)
    {
        if(s == A.length)
        {
            for(int i = 0; i < A.length; i++)
                System.out.print(ch[A[i]]);
            System.out.print(" ");
            count++;
            if(count % 8 == 0) System.out.println();
            return;
        }
        for(int i = s; i < A.length; i++)
        {
            int T = A[s];
            A[s] = A[i];
            A[i] = T;
            anagram(ch, A, s + 1);
            T = A[s];
            A[s] = A[i];
            A[i] = T;
        }
    }
}