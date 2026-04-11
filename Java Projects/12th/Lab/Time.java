import java.util.*;
public class Time {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.print("INPUT: ");
        String s=sc.nextLine().toUpperCase();
        int h=Integer.parseInt(s.substring(0,s.indexOf(':')));
        int m=Integer.parseInt(s.substring(s.indexOf(':')+1, s.indexOf(':')+3));
        System.out.print("OUTPUT: ");
        if(h>12 || h<1 || m>59 || m<0) {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        else if(s.charAt(s.length()-2)=='P') {
            if(h!=12) {
                h+=12;
                System.out.println(h+":"+m);
            }
            else
                System.out.println("12"+s.substring(s.indexOf(':'),s.length()-2));
        }
        else {
            if(h==12)
                System.out.println("00"+s.substring(s.indexOf(':'),s.length()-2));
            else if(s.substring(0,s.indexOf(':')).length()==1)
                System.out.println("0"+s.substring(0,s.length()-2));
            else
                System.out.println(s.substring(0,s.length()-2));
        }
        sc.close();
    }
}