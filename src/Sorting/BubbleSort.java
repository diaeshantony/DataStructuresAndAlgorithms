package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {76, 7, -1, 23, 34, 16, 10};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
            lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
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
