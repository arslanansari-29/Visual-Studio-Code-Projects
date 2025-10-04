public class Series9 {
    public static void main(String[] args) {
        int a=1, b=2, c = 0;
        for (int i = 1; i<=9; i++) {
           c = c+a+b;
           a++;
           b++;
        }
        System.out.println(c);
    }
}
