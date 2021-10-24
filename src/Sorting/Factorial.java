package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to find the fact");
        int num = Integer.parseInt(br.readLine());

        int recursiveFact = recursiveFact(num);
        int iterativeFact = iterativeFact(num);

        System.out.println("Recursive Factorial is :" + recursiveFact);
        System.out.println("Iterative Factorial is :" + iterativeFact);
    }

    public static int recursiveFact(int num) {
        if (num == 0) {
           return 1;
        }
        return num * recursiveFact(num - 1);
    }

    public static int iterativeFact(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
