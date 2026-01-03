import java.util.Arrays;
import java.util.Random;

public class RandomNumberSorting {
    public static void main(String[] args) {

        int size = 10;              // number of random elements
        int[] numbers = new int[size];
        Random rand = new Random();

        // Generate random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); // random numbers from 0 to 99
        }

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(numbers));
    }
}
