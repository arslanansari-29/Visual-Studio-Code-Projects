import java.util.Scanner;

public class Rupees
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT:\nAmount: ");
        String amount = sc.next();
        String arr1[] = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN",
        "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY" };
        String arr2[] = { "", "TEN", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY" };
        String arr3[] = { "CRORE", "LAKH", "THOUSAND", "HUNDRED", "AND", "PAISE" };
        String word1, word2, newWord = "";
        System.out.println("OUTPUT:");
        if (amount.indexOf('.') == -1) 
        { 
            word1 = amount;
            word2 = "00";
            if(word1.length()>9)
            {
                System.out.println("OUT OF RANGE ");
                sc.close();
                return;
            }
            System.out.println("Amount: "+amount+"."+word2);
        } 
        else
        {
            word1 = amount.substring(0, amount.indexOf('.'));
            if(word1.length()>9)
            {
                System.out.println("OUT OF RANGE ");
                sc.close();
                return;
            }
            word2 = amount.substring(amount.indexOf('.') + 1);
            if(word2.length()>2)
                System.out.println("Amount: "+word1+"."+amount.substring(amount.indexOf('.')+1,amount.indexOf('.')+3));
            else if (word2.length()==1)
                System.out.println("Amount: "+word1+"."+word2+"0");
            else
                System.out.println("Amount: "+amount);
        }
        while (word1.length() != 9)
            word1 = "0" + word1;
        while (word2.length() == 1)
            word2 = word2 + "0";
        String word = word1 + word2;
        for (int i = 0, j = 0; i <= 9; i += 2, j++) {
            int x;
            if (i == 6) {
                x = Integer.parseInt(word.substring(i, i + 1));
                i = i - 1;
            } 
            else
                x = Integer.parseInt(word.substring(i, i + 2));
            if (x == 0) {
                if (j == 5)
                    newWord += "ZERO PAISE ";
                continue;
            } 
            else if (x < 20)
                newWord += arr1[x] + " ";
            else {
                int d = x % 10;
                int l = x / 10;
                if (d == 0)
                    newWord += arr2[l] + " ";
                else
                    newWord += arr2[l] + " " + arr1[d] + " ";
            }
            newWord += arr3[j] + " ";
        }
        newWord += "ONLY";
        System.out.println("RUPEES, "+newWord);
        sc.close();
    }
}