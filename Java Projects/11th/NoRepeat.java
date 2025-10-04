import java.util.Scanner;

public class NoRepeat {
    String word;
    int length;

    NoRepeat(String wd) {
        word = wd;
        length = word.length();
    }

    boolean check() {
        for(int i=0; i<length; i++) {
            if(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    void print() {
        if(check())
            System.out.println(word + " has no repeating characters.");
        else
            System.out.println(word + " has repeating characters.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        NoRepeat ob = new NoRepeat(scanner.next().toUpperCase().trim());
        ob.print();
        scanner.close();
    }

}
