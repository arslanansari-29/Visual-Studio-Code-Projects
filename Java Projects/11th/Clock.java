import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT: Time-");
        int ar[] = new int[2];
        for(int i=0; i<2; i++) {
            ar[i] = sc.nextInt();
        }
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",};
        
        System.out.print("OUTPUT: "+ar[0]+":"+ar[1]+" ");
        if(ar[0]<0 || ar[0]>12 || ar[1]<0 || ar[1]>59) {
            System.out.print("INVALID TIME");
            System.exit(0);
        }
        if(ar[1]==0) {
            System.out.println(numbers[ar[0]]+" o' clock");
        }
        else if(ar[1]==15) {
            System.out.println("quarter past "+numbers[ar[0]]);
        }
        else if(ar[1]>20 && ar[1]<30) {
            System.out.println("twenty "+numbers[ar[1]-20]+" minutes past "+numbers[ar[0]]);
        }
        else if(ar[1]==30) {
            System.out.println("half past "+numbers[ar[0]]);
        }
        else if(ar[1]>30 && ar[1]<45) {
            System.out.println(numbers[60-ar[1]]+" minutes to "+numbers[(ar[0])+1]);
        }
        else if(ar[1]==45) {
            System.out.println("quarter to "+numbers[(ar[0])+1]);
        }
        else if(ar[1]>45 && ar[1]<60) {
            System.out.println(numbers[60-ar[1]]+" minutes to "+numbers[(ar[0])+1]);
        }
        sc.close();
    }
}
