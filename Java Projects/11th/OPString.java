import java.util.Scanner;

public class OPString {
    String str, msk, nstr;

    OPString() {
        str = "";
        msk = "";
        nstr = "";
    }

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter original string: ");
        str = scanner.nextLine().toLowerCase().trim();
        System.out.print("Enter mask string: ");
        msk = scanner.nextLine().toLowerCase().trim();
        scanner.close();
    }

    void form() {
        for(int i=0; i<str.length(); i++) {
            if(msk.indexOf(str.charAt(i)) != -1) 
                nstr += str.charAt(i);
        }
    }

    void display() {
        System.out.println("Original String: " + str);
        System.out.println("Mask String: " + msk);
        System.out.println("New String: " + nstr);
    }
    public static void main(String[] args) {
        OPString obj = new OPString();
        obj.accept();
        obj.form();
        obj.display();
    }
}
