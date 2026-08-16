import java.util.*;
class Fazal15
{
    public static void  main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT: ");
        String s=sc.nextLine().toUpperCase().trim();
        if(s.indexOf('.') == -1 && s.indexOf('?') == -1 && s.indexOf('!') == -1) {
            System.out.println("OUTPUT:INVALID INPUT");
            System.exit(0);
        }
        System.out.print("WORD TO BE DELETED: ");
        String del=sc.next().toUpperCase();
        System.out.print("WORD POSITION IN THE SENTENCE: ");
        int pos=sc.nextInt();
        StringTokenizer x=new StringTokenizer(s);
        String copy=s,check="",extra="";
        s="";
        int total=x.countTokens();
        for(int i=1;i<=total;i++) {
            if(pos==i)
            {
                extra=x.nextToken();
                if(extra.length()>del.length())
                { 
                    s=s+""+extra.charAt(extra.length()-1);
                    check=extra.substring(0,extra.length()-1);
                    if(!(check.equals(del)))
                    {
                        System.out.print("OUTPUT: "+copy);
                        System.exit(0);
                    }
                }
                else if(!(extra.equals(del)))
                {
                    System.out.print("OUTPUT: "+copy);
                    System.exit(0);
                }
                continue;
            }
            s=s+" "+x.nextToken();
        }
        System.out.println("OUTPUT:"+s);
        sc.close();
    }
}