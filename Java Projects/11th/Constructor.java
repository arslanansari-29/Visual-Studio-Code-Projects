public class Constructor {
    int a,b,c;
    Constructor() {
        a=10;
        b=90;
        c=0;
        System.out.print(a+"\n"+b+"\n"+c);
    }
    Constructor(int x, int y) {
        a+=x;
        b-=y;
        System.out.println(a+"\n"+b);
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj2 = new Constructor(5, 10);
    }
    
}
