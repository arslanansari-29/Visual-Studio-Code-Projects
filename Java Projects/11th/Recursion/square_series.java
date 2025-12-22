public class square_series {
    public static void main(String[] args) {
        int n=5;
        printSquareSeries(n);
    }
    static void printSquareSeries(int n)
    {
        if(n>0)
        {
            printSquareSeries(n-1);
            System.out.println(n*n);
        }
    }
}
