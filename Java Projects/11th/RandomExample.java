import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1,7);
        System.out.println("Random number: " + randomNumber);
        // Take input Unique(No Duplicate) Random elements in an array using random class
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(1,11);
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}