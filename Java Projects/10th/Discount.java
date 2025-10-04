import java.util.*;
public class Discount {
    static char tp;
    static int amt;
    double dL,dD, net;
    Discount(char t, int a) {
        tp=t;
        amt=a;
    }
    void calculate() {
        if(amt>0 && amt<=25000) {
            dL=0.0/100*amt;
            dD=5.0/100*amt;
        }
        else if(amt>=25001 && amt<=57000) {
            dL=5.0/100*amt;
            dD=7.5/100*amt;
        }
        else if(amt>=57001 && amt<=100000) {
            dL=7.5/100*amt;
            dD=10.0/100*amt;
        }
        else if(amt>100000) {
            dL=10.0/100*amt;
            dD=15.0/100*amt;
        }
        net=tp=='L'?amt-dL:amt-dD;

    }
    void display() {
        System.out.println("Purchase amount\tType of Purchase\tDiscount amount\tNet Amount");
        System.out.println(tp=='L'?amt+"\tLaptop\t"+dL+"\t"+net:amt+"\tDesktop\t"+dD+"\t"+net);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of purchase\nL-Laptop or D-Desktop: ");
        char type=scanner.next().charAt(0);
        System.out.print("Enter amount: ");
        int amount=scanner.nextInt();
        Discount ob = new Discount(type, amount);
        ob.calculate();
        ob.display();
        scanner.close();
    }
}
