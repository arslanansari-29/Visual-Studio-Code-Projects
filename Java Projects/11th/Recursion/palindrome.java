public class palindrome {
    public static void main(String[] args) {
        int n=123;
        reverse(n);
    }

    static void reverse(int n)
    {
        int r=0;
        if(n==0)
            return;
        System.out.print(r*10+n%10);
        reverse(n/10);
    }
}
