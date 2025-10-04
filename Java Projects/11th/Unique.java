import java.util.Scanner;

public class Unique {
    String word;
    int length;
    Unique() {
        word = "";
        length = 0;
    }
    public static void main(String[] args) {
        Unique ob = new Unique();
        ob.accept();
        ob.display();
    }
    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = scanner.nextLine().toUpperCase().trim();
        length = word.length();
        scanner.close();
    }

    boolean checkUnique() {
        return ("AEIOUaeiou".indexOf(word.charAt(0))!=-1 && "AEIOUaeiou".indexOf(word.charAt(length - 1)) != -1);
    }

    void display() {
       if(checkUnique())
            System.out.println(word+" is a unique word.");
        else
            System.out.println(word+" is not a unique word.");
    }
}
