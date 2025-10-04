public class PYQ2024_Question4 {
    public static void main(String[] args) {
        
    }
    double perform(double r, double h) {
        return 22.0/7 * r * (Math.sqrt(r*r + h*h)) ;
    }
    void perform(int r, int c) {
        for(int i=1 ; i<=r ; i++) {
            for(int j=1; j<=c; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void perform(int m, int n, char ch) {
        if(ch=='Q') {
            System.out.print(m/n);
        }
        else if(ch=='R') {
            System.out.print(m%n);
        }
    }
}
