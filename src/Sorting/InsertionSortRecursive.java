package Sorting;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSortRecursive(intArray, intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void insertionSortRecursive(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionSortRecursive(input, numItems - 1);

        int newElement = input[numItems - 1];
        int i;

        for(i = numItems - 1; i > 0 && input[i -1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;

        System.out.println("Result of call when numItems =" + numItems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("---------------------");
    }
}
