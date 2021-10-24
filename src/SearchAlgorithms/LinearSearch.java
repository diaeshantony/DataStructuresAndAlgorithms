package SearchAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {23, 45, 90, 2, -15, 6, 1, 89, 24};
        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, 24));
        System.out.println(linearSearch(intArray, 999));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
