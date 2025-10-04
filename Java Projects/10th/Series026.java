public class Series026 {
    public static void main(String[] args) {
        double s=0.0;
        for(int i=1; i<=10; i++) {
            double p=1.0;
            for(int j=1; j<=i; j++)
                p=p*j;
            s=s+1/p;
        }
        System.out.print("Sum = "+s);
    }
}
