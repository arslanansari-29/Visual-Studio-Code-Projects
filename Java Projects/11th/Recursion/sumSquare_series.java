public class sumSquare_series {
    public static void main(String[] args) {
        int n=5;
        sumSquare(n);
    }
    static void sumSquare(int n)
    {
        if(n==0)
            return;
        sumSquare(n-1);
        System.out.print(n*n+" ");
    }
}
