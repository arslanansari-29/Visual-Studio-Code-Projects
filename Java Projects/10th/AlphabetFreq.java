import java.util.Scanner;

public class AlphabetFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().toUpperCase();
        int c=0;
        char C='A';
        for(char X = 'A'; X <= 'Z'; X++) {
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                char ch=line.charAt(i);
                if(ch == X)
                    count++;
            }
            if(count > c) {
                c = count;
                C = X;
            }
        }
        System.out.println(C);
        scanner.close();
    }
}
