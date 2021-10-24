package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            /* Another way of doing
            * buckets[i] = new LinkedList<Integer>();
            * */
            buckets[i] = new ArrayList<Integer>();
        }

        //Add elements to each bucket
        for(int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        //Sort each bucket
        for(List bucket : buckets) {
            Collections.sort(bucket);
        }

        //Merge the values from the buckets to an array
        int j =0;
        for(int i = 0; i < buckets.length; i++) {
            for(int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    public static int hash(int value) {
        return value / (int) 10;
    }
}
