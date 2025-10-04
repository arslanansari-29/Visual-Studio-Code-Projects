import java.util.*;
public class SpecialWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        // String s2=s1.toLowerCase();
        System.out.println(s1.charAt(0)==s1.charAt(s1.length()-1)?"Special Word":"Not a Special Word");
        sc.close();
    }
}
