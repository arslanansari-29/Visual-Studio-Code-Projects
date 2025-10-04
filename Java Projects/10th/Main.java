// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj =new Main();
        obj.Called();
        Calling();
    }
    public static void Calling() {
        System.out.println();
    }
    public void Called() {
        System.out.println("Called");
    }
}

class Main2 {
    public static void main(String[] args) {
        Main.Calling();
        Main obj = new Main();
        obj.Called();
    }
    public void method2() {
        Main obj = new Main();
        obj.Called();
        Main.Calling();
    }
}