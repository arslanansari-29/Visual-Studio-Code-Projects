public class Static_NonStatic {

    public static void main(String[] args) {
        System.out.println("Transfering control to CallingMethod from main method");
        Static_NonStatic obj = new Static_NonStatic();
        obj.CallingMethod();
        // Practice.CalledMethod();
    }

    static void CalledMethod() {
        System.out.println("Control is in CalledMethod(member-function)");
        // CallingMethod();
        // InstanceClass.InstanceCalledMethod();
    }
    void CallingMethod() {
        System.out.println("Control is in CallingMethod(member-function)");
        CalledMethod();
        InstanceClass.InstanceCalledMethod();
    }   
}
class InstanceClass {
    static void InstanceCalledMethod() {
        System.out.println("Control is in InstanceCalledMethod from CallingMethod");
        Static_NonStatic.CalledMethod();
        // CallingMethod();
    }
}