import java.util.Scanner;

public class KaprekarLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT: ");
        System.out.print("P = ");
        int P = sc.nextInt();
        System.out.print("Q = ");
        int Q = sc.nextInt();
        if(P>=Q || P >=5000 || Q >= 5000) {
            System.out.print("INVALID RANGE");
            System.exit(0);
        }
        int freq = 0;
        System.out.println("THE KAPREkAR NUMBERS ARE: ");
        for(int i=P; i<=Q; i++) {
            if(isKaprekar(i)) {
                if(freq == 0)
                    System.out.print(i);
                else
                    System.out.print(" " + i);
                freq++;
            }
        }
        System.out.print("\nFREQUENCY OF KAPREKAR NUMBER IS: "+freq);
        sc.close();
    }

    static boolean isKaprekar(int n) {
        return n==n*n/((int)Math.pow(10,String.valueOf(n).length())) + n*n%((int)Math.pow(10,String.valueOf(n).length()));
    }
}
