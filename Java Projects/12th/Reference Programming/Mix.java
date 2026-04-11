import java.util.Scanner;

public class Mix {
    String wrd;
    int len;
    Mix() {
        wrd = "";
        len = 0;
    }

    void feedword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        wrd = sc.next().toUpperCase();
        len = wrd.length();
    }

    void mix_word(Mix P, Mix Q) {
        int i=0;
        while(i<P.len && i<Q.len) {
            wrd+=""+P.wrd.charAt(i)+Q.wrd.charAt(i);
            i++;
        }
        while(i<P.len) {
            wrd+=P.wrd.charAt(i);
            i++;
        }
        while(i<Q.len) {
            wrd+=Q.wrd.charAt(i);
            i++;
        }
    }

    void display() {
        System.out.println(wrd);
    }

    public static void main(String[] args) {
        Mix P = new Mix();
        P.feedword();
        Mix Q = new Mix();
        Q.feedword();
        Mix R = new Mix();
        R.mix_word(P, Q);
        System.out.println("Word 1: ");
        P.display();
        System.out.println("Word 2: ");
        Q.display();
        System.out.println("Mixed Word: ");
        R.display();
    }
}
