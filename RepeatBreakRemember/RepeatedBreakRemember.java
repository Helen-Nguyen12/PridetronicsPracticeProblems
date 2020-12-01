import java.util.Scanner;

public class RepeatedBreakRemember {
    public static void main(String[] args) {
        // Initalize scanner and grab number from terminal
        Scanner scanner = new Scanner(System.in);
        // Asks User for a number
        System.out.println("Insert an Integer Number:");
        //Grabs number from terminal
        int count = scanner.nextInt();
        int sum = 0;
        int number = 0;
        int mean = 0;
        /*int odd = 0;
        int even = 0;

        if (count/2 == 0){
            even = count;
            System.out.println ("Even Numbers: " + even);
        }
        if (count/2 != 0){
            odd = count;
            System.out.println("Odd Numbers: " + odd);
        }
        */

        //While loop to asks for number until user puts in -1
        while (count != -1) {
            if (count == -1) {
                break;
            }
            else if (count > -1 || count < -1) {
                System.out.println("Insert an Integer Number:");
                count = scanner.nextInt();
                sum += count;
                number ++;
                mean = sum/number;
                System.out.println("Sum = " + sum);
                System.out.println("Numbers of Times You Inserted a Number: " + number);
                System.out.println("Mean: " + mean);
            } 
        }
        //Prints out the words
        System.out.println("Thanks! Bye!");
        //Close Scanner
        scanner.close();
    }
    //I can't fix the part where I shouldn't include -1 to the parts.

    /*
     * for(int count = scanner.nextInt(); count < 10; count ++){ if (count == -1) {
     * System.out.print("Thanks! Bye!"); break; } if (count != -1) {
     * System.out.println("Insert a Number:"); continue; } }
     * 
     * //For loop to repeat 10 times, counting by 1 
     * for(int count = 1; count <= 10; count ++){
     *  System.out.println(count); }
     */
}