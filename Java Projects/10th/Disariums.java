public class Disariums {
    public static void main(String[] args) {
        for(int i=11;i<=1000;i++) {
            int c=i, s=0, r=0, k=0;
            while (c!=0) {
                int d=c%10;
                r=r*10+d;
                c=c/10;
            }
            while (r!=0) {
                int d=r%10;
                k++;
                s+=(int)(Math.pow(d, k));
                r/=10;
            }
            if (s==i) 
                System.out.println(i);
        }
    }
}
