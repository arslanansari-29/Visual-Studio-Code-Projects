public class Technos {
    public static void main(String[] args) {
        for (int i = 1000; i<=9999; i++) {
            int r=i%100;
            int l=i/100;
            if ((r+l)*(r+l)==i) {
                System.out.println(i);
            }
        }
    }
}
