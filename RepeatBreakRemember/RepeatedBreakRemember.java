import java.util.Scanner;

public class RepeatedBreakRemember {
    public static void main(String[] args) {
        // Initalize scanner and grab number from terminal
        Scanner scanner = new Scanner(System.in);
        // Grabs number from terminal
        int count = 0;
        int sum = 0;
        int number = 0;
        int odd = 0; 
        int even = 0;
         
        // While loop to asks for number until user puts in -1
        while (true) {
            System.out.println("Insert an Integer Number:");
            count += scanner.nextInt();
            //Will stop running after -1 is inputted
            if (count == -1) {
                break;
            }
            //Valid Number
            else if (count != -1) {
                sum += count;
                number++;
            }
             //Will prove true if number is even
            if (count % 2 == 0){ 
            even = count; System.out.println ("Even Numbers: " + even); 
            even++;
            } 
            //Will prove true if number is odd
            else if (count % 2 != 0){ 
            odd = count; 
            System.out.println("Odd Numbers: " + odd); 
            odd++;
            }

        }
        //Calcutues the average
        int mean = sum/number;
        // Prints out the words
        System.out.println("Sum = " + sum);
        System.out.println("Numbers of Times You Inserted a Number: " + number);
        System.out.println("Mean: " + mean);
        System.out.println("Thanks! Bye!");
        // Close Scanner
        scanner.close();
    }

    /*
     * for(int count = scanner.nextInt(); count < 10; count ++){ if (count == -1) {
     * System.out.print("Thanks! Bye!"); break; } if (count != -1) {
     * System.out.println("Insert a Number:"); continue; } }
     * 
     * //For loop to repeat 10 times, counting by 1 for(int count = 1; count <= 10;
     * count ++){ System.out.println(count); }
     */
}