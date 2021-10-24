import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        //Method to read the String input from console.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String str = br.readLine();
        System.out.println("You have entered :" + str);

        //Method to read the Int input from console.
        System.out.println("Enter an integer");
        int a = Integer.parseInt(br.readLine());
        System.out.println("The integer value is :" + a);

        //Usage of a Scanner for string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a scanner String");
        String str1 = sc.nextLine();


        //Usage of a Scanner for int
        System.out.println("enter a scanner int");
        int b = sc.nextInt();
        System.out.println("Scanner int is :" + b);
    }
}
