public class Main {

    public static void main(String[] args) {

        int[] myArray = {8, 5, -4, 6, -2, -7};
        int sum = 0;
        for (int j : myArray) {
            if (j > 0) {
                sum += j;
            }
        }
        System.out.println("Sum of positive numbers in the array is " + sum);

    }
}