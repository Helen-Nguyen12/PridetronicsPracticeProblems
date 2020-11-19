import java.util.Scanner;
class SimpleFizzBuzz {
    public static void main(String[] args) {
        //Initiates scanner object
        Scanner scanner = new Scanner(System.in);
        //Ask the user for the number
        System.out.println("Enter a number between 1-100");
        //Store number for scanner
        double number = scanner.nextDouble();
        //Prints out the number inputted
        System.out.println(number);
        //Prints out the word if they equal to 0 with their statement
        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        //Close the scanner
        scanner.close();
    }  
} 