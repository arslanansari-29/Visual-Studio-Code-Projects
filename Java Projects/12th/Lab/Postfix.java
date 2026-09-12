import java.util.*;
class Postfix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int value[] = new int[26];
        boolean entered[] = new boolean[26];
        System.out.print("Enter Postfix Expression: ");
        String exp = sc.nextLine();
        int stack[] = new int[exp.length()];
        int top = -1;
        System.out.println("Enter values of");
        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(Character.isLetter(ch))
            {
                int index = Character.toUpperCase(ch) - 'A';
                if(!entered[index])
                {
                    System.out.print(ch + " = ");
                    value[index] = sc.nextInt();
                    entered[index] = true;
                }
                stack[++top] = value[index];
            }
            else
            {
                int b = stack[top--];
                int a = stack[top--];
                if(ch == '+')
                    stack[++top] = a + b;
                else if(ch == '-')
                    stack[++top] = a - b;
                else if(ch == '*')
                    stack[++top] = a * b;
                else if(ch == '/')
                    stack[++top] = a / b;
                else if(ch == '^')
                    stack[++top] = (int)Math.pow(a, b);
            }
        }
        System.out.println("Answer : " + stack[top]);
        sc.close();
    }
}
