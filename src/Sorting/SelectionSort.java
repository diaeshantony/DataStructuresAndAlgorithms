package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {76, 34, -5, 78, 55, 4, 35};

        for(int unSortedArrayIndex = intArray.length - 1; unSortedArrayIndex > 0;
           unSortedArrayIndex--) {

            int largest = 0;
            for(int i = 1; i <= unSortedArrayIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, unSortedArrayIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int [] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
