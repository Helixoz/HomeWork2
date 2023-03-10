import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {2, 3, 1, 7, 11};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Reverse order of the array is " + Arrays.toString(numbers));
    }
}