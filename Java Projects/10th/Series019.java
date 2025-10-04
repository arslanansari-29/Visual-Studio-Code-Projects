public class Series019 {
    public static void main(String[] args) {
        long s=0L;
        for(int i=1; i<=3; i++) {
            int p=1;
            for(int j=1; j<=i+1; j++)
                p=p*j;
            s=s+p;
        }
        System.out.print("Sum = "+s);
    }
}
