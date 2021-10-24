package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {89, -2, 35, 23, 67, 5, -1};
        int i;

        for(int unSortedArrayIndex = 1; unSortedArrayIndex < intArray.length;
            unSortedArrayIndex++) {

            int newElement = intArray[unSortedArrayIndex];
            for(i = unSortedArrayIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for (i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
