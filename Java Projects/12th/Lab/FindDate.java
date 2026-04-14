import java.util.Scanner;
class FindDate{
    static int i = 1;
    static int dayNum = 0;
    static int year = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: ");
        System.out.print("DAY NUMBER\t\t");
        dayNum = sc.nextInt();
        System.out.print("\tYEAR\t\t\t");
        year = sc.nextInt();
        System.out.print("\tDATE AFTER (N DAYS):\t");
        int N = sc.nextInt();
        System.out.print("OUTPUT: ");
        if((dayNum < 1 || dayNum > 366) || dayNum == 366 && !isLeap(year)){
            System.out.println("DAY NUMBER OUT OF RANGE");
            System.exit(0);
        }
        if(N < 1 || N > 100){
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
            System.exit(0);
        }
        System.out.print("DATE\t\t\t");
        displayDate();
        dayNum += N;
        System.out.print("\tDATE AFTER " + N + " DAYS:\t");
        displayDate();
        sc.close();
    }
    public static boolean isLeap(int y){
        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            return true;
        return false;
    }
    public static void displayDate(){
        String month[] = {"", "JANURAY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeap(year))
            days[2] = 29;
        while(dayNum > days[i]){
            dayNum -= days[i];
            i++;
            if(i > 12){
                i = 1;
                year++;
                if(isLeap(year))
                    days[2] = 29;
                else
                    days[2] = 28;
            }
        }
        String suffix = "TH";
        if(dayNum < 4 || dayNum > 20){
            int lastDigit = dayNum % 10;
            switch(lastDigit){
            case 1:
                suffix = "ST";
                break;
            case 2:
                suffix = "ND";
                break;
            case 3:
                suffix = "RD";
                break;
            }
        }
        System.out.println(dayNum + suffix + " " + month[i] + ", " + year);
    }
}
