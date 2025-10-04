import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your basic salary");
        double B = sc.nextDouble();
        double DA = 25.0/100;
        double HRA = 15.0/100;
        double PF = 8.33/100;
        double NP = B+DA+HRA;
        double G = NP-PF;
        System.out.println("Net Pay = "+NP);
        System.out.println("Gross = "+G);
        sc.close();
    }
}
