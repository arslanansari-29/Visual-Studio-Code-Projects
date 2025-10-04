import java.util.Scanner;

public class DoubleFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine().toUpperCase();
        int k=0;
        for(int i=0; i<line.length()-1; i++) {
            if(line.charAt(i)==line.charAt(i+1))
                k++;
        }
        System.out.print(k);
        scanner.close();
    }
}
