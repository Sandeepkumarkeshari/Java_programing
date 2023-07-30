import java.util.Scanner;
import java.lang.System;//that is the bydefault package in the java.........
public class Add_2 {
    //  Using Function to calculate the sum of two numbers.....
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("This is a function example in Java.");
        Scanner sc = new Scanner(System.in);

        // Taking input from the user....
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calling the sum function to calculate the sum.....
        int result = sum(num1, num2);

        // Displaying the result.....
        System.out.println("Sum: " + result);
    }
}
