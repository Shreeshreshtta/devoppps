import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display numbers before swapping
        System.out.println("Before swapping: ");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        // Swap the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display numbers after swapping
        System.out.println("After swapping: ");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
