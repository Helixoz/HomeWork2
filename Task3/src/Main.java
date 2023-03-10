public class Main {

    public static void main(String[] args) {

        System.out.println("Average number of the array list is " + averageOfTheList());
    }

    public static int averageOfTheList() {
        int[] myArray = {6, 10, 7, 9, 8};
        int sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        return sum / myArray.length;

    }
}