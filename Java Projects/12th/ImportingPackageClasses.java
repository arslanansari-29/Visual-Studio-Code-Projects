import Utils.Calc;
public class ImportingPackageClasses {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + Calc.digitCount(number));
        System.out.println("Sum of Digits: " + Calc.sumOfDigits(number));
        System.out.println("Product of Digits: " + Calc.productOfDigits(number));
        System.out.println("Reversed Number: " + Calc.reverse(number));
        System.out.println("Is Palindrome: " + Calc.isPalindrome(number));
        System.out.println("Factorial of 5: " + Calc.factorial(5));
        System.out.println("Is Prime (29): " + Calc.isPrime(29));
        
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = Calc.linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
