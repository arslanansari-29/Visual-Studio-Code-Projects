import java.util.Scanner;
class DecodeMessage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Encoded Message: ");
        String code = sc.nextLine();
        StringBuffer sb = new StringBuffer(code);
        String revCode = sb.reverse().toString();
        if(!valid(revCode)){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.print("THE DECODED MESSAGE: ");
        String msg = "";
        int i = 0;
        while(i < revCode.length()){
            int num = Integer.parseInt(String.valueOf(revCode.charAt(i)));
            while(num <= 122){
                if(num >= 'A' && num <= 'Z'){
                    if(msg.length() == 0 || msg.endsWith(" "))
                        msg += Character.toUpperCase((char)num);
                    else
                        msg += Character.toLowerCase((char)num);
                    break;
                }
                else if(num >= 'a' && num <= 'z'){
                    if(msg.length() == 0 || msg.endsWith(" "))
                        msg += Character.toUpperCase((char)num);
                    else
                        msg += Character.toLowerCase((char)num);
                    break;
                }
                else if(num == ' '){
                    if(!msg.endsWith(" ")){
                        msg += (char)num;
                        break;
                    }
                    else
                        break;
                }
                else if(i + 1 < revCode.length()){
                    num = Integer.parseInt(num + "" + revCode.charAt(i + 1));
                    i++;
                }
                else
                    i++;
            }
            i++;
        }
        System.out.println(msg);
        sc.close();
    }
    public static boolean valid(String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}