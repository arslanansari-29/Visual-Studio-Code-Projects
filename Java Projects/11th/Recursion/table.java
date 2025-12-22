public class table {
    public static void main(String[] args) {
        int n=5, i=10;
        printTable(n, i);
    }

    static void printTable(int n, int i)
    {
        if(i<=0)
            return;
        printTable(n, i-1);
        System.out.println(n*i);
    }
}
