import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ar = {5.6, 11.5, 20.8, 35.4, 43.1, 52.4, 66.6, 78.9, 80.0, 95.5};
        System.out.print("Enter a number:");
        double n = scanner.nextDouble();
        int L = 0, U=ar.length-1, M=-1, p=0;
        boolean f=false;
        for(int i=0; i<ar.length; i++) {
            while (L<=U) {
                M=(L+U)/2;
                if(n<ar[M])
                    U=M-1;
                else if(n>ar[M])
                    L=M+1; 
                else {
                    p = i+1;
                    f=true;
                    break;
                }
            }
        }
        System.out.println(f?"Number found: "+ar[M]+"\nPosition: "+p:"Number not found");
        scanner.close();
    }
}
