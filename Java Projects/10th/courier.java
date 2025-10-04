import java.util.Scanner;
public class courier {
    static String name;
    static int weight;
    static String address;
    static int bill;
    static char type;
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        courier ob = new courier();
        ob.accept();
        ob.calculate();
        ob.print();
        // scanner.close();
    }
    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter weight: ");
        weight = scanner.nextInt();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        System.out.print("Enter type: ");
        type = scanner.next().charAt(0);
        scanner.close();
    }
    void calculate() {
        if(weight >= 0 && weight <= 5)
            bill = 800*weight;
        else if(weight >= 0 && weight <= 10)
            bill = 800*5 + 700*(weight-5);
        else if(weight > 10)
            bill = 800*5 + 700*5 + 500*(weight-10);
        if(type == 'I')
            bill+=1500;
    }
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Address: " + address);
        System.out.println("Type: " + type);
        System.out.println("Bill: " + bill);
    }
}
