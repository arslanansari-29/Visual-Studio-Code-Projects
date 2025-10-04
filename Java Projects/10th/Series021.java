public class Series021 {
    public static void main(String[] args) {
        double s=0.0;
        for(int i=1; i<=10; i++)
            s=i%2==0?s-i/(i+1.0):s+i/(i+1.0);
        System.out.print("Sum = "+s);
    }
}
