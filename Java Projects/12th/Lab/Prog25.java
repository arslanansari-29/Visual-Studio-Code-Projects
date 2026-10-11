import java.util.*;
public class Prog25 {
    static int daysIn(int m, int y) {
        int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)))
            return 29;
        return d[m - 1];
    }
    static boolean isNumber(String s) {
        if (s.length() == 0 || s.length() > 4)
            return false;
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.print("ENTER PROJECT DATE: ");
        String date = sc.nextLine().trim();
        System.out.print("DAY OF THE WEEK: ");
        String day = sc.nextLine().trim().toUpperCase();
        String[] p = new String[3];
        p[0] = date.substring(0, date.indexOf('/'));
        p[1] = date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'));
        p[2] = date.substring(date.lastIndexOf('/') + 1);
        String ds = p[0].trim(), ms = p[1].trim(), ys = p[2].trim();
        if (!isNumber(ds) || !isNumber(ms) || !isNumber(ys)) {
            System.out.println("INVALID DATE");
            sc.close(); return;
        }
        int d = Integer.parseInt(ds);
        int m = Integer.parseInt(ms);
        int y = Integer.parseInt(ys);
        if (y < 1 || m < 1 || m > 12 || d < 1 || d > daysIn(m, y)) {
            System.out.println("INVALID DATE");
            sc.close(); return;
        }
        int dow = -1;
        for (int i = 0; i < 7; i++)
            if (names[i].equals(day)) dow = i;
        if (dow == -1) {
            System.out.println("INVALID DAY");
            sc.close(); return;
        }
        for (int i = 1; i <= 89; i++) {
            d++;
            if (d > daysIn(m, y)) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                }
            }
            dow = (dow + 1) % 7;
        }
        System.out.println("PROJECT SUBMISSION DATE: " + (d < 10 ? "0" : "") + d + "/" + (m < 10 ? "0" : "") + m + "/" + y);
        System.out.println("DAY OF THE WEEK: " + names[dow]);
        if (dow == 0) {
            d++;
            if (d > daysIn(m, y)) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                }
            }
            dow = 1;
            System.out.println("PROJECT TO BE SUBMITTED: " + (d < 10 ? "0" : "") + d + "/" + (m < 10 ? "0" : "") + m + "/" + y);
            System.out.println("DAY OF THE WEEK: " + names[dow]);
        } sc.close();
    }
}