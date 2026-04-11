import java.util.Scanner;

public class EqMat {
    int a[][];
    int m, n;
    EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[m][n];
    }

    void readarray() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
    }

    int check(EqMat P, EqMat Q) {
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(P.a[i][j] != Q.a[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    void print() {
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        EqMat P = new EqMat(3, 3);
        P.readarray();
        EqMat Q = new EqMat(3, 3);
        Q.readarray();
        EqMat C = new EqMat(3, 3);
        System.out.println("Matrix 1:");
        P.print();
        System.out.println("Matrix 2:");
        Q.print();
        if(C.check(P, Q) == 1) {
            System.out.print("The matrices are equal.");
        } else {
            System.out.print("The matrices are not equal.");
        }
    }
}