import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().toUpperCase().trim()+" ";
        int k = 0;
        for(int i=0; i<line.length(); i++) {
            char c = line.charAt(i);
            if("AEIOUeiou".indexOf(c)!=-1)
                k++;
        }
        System.out.print(k);
        scanner.close();
    }
}
