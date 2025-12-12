import java.util.Scanner;
class Decode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("CODE: ");
        String code = in.nextLine();
        if(!valid(code)){
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        String msg = "";
        int i = 0;
        while(i < code.length()){
            int num = Integer.parseInt(String.valueOf(code.charAt(i)));
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
                else if(i + 1 < code.length()){
                    num = Integer.parseInt(num + "" + code.charAt(i + 1));
                    i++;
                }
                else
                    i++;
            }
            i++;
        }
        System.out.println(msg);
        in.close();
    }
    public static boolean valid(String s){
        for(int i = 0; i < s.length(); i++){
            char  ch = s.charAt(i);
            if(!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}