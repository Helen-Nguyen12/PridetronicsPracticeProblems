import java.util.Scanner;

public class FactorialFinder {
    public static void main (String[]  agrs) {
        //Asks user for a number
        System.out.println("Enter number:");
        //Initates a scanner and grab the number from terminal.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //Create a for loop
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        //Close scanner
        scanner.close();
    }
}