class EmpSal {
    String empnam;
    int empcode;
    double salary;
    EmpSal(String empnam, int empcode, double salary) {
        this.empnam = empnam;
        this.empcode = empcode;
        this.salary = salary;
    }
    public void show() {
        System.out.print("Name of the employee: "+empnam);
        System.out.print("Employee code: "+empcode);
        System.out.print("Salary of the employee: "+salary);
    }
}

class Overtime extends EmpSal {
    private int hours;
    private double totsal;
    Overtime(String empnam, int empcode, double salary, int hours) {
        super(empnam, empcode, salary);
        this.hours = hours;
        calSal();
    }

    public void calSal() {
        if(hours>40) {
            totsal=salary+5000;
        }
        else if(hours>=30 || hours<=40) {
            totsal=salary+3000;
        }
        else if(hours<30) {
            totsal=salary;
        }
    }

    public void show() {
        super.show();
        System.out.println("Overtime hours: "+hours);
        System.out.print("Total salary of the employee: "+totsal);
    }
}