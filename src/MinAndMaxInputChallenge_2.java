import java.util.Scanner;

public class    MinAndMaxInputChallenge_2 {

/*2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message •Enter number: •
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
*/
    public static void main(String[] args) {        //main method

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number (or -1 to stop): ");  // user input
        int number = scan.nextInt();                        // int number for input
        int max = number;                                   // defined max
        int min = number;                                   // defined min

        while (number >= 0) {                              // number >=0 or above in while loop
            if (number > max) {                            // if number is greater than max
                max = number;                              // then max become the number
            } else if (number < min) {                     // if number less than min
                min = number;                              // then min becomes the number
            }
            System.out.print("Enter number (or -1 to stop): ");
            number = scan.nextInt();                       // next user input within the loop
        }                                                   // while loop ends if user chooses -1

        if (max >=0 && min >=0) {                       // min & max condition for numbers greater than equal to 0
            System.out.println("Maximum was " + max);       // print max
            System.out.println("Minimum was " + min);       // print min
            int Sum = (+max) + (+min);                      // int Sum define for sum of min & max
            System.out.println("Sum of Max & Min numbers :" + Sum);  // print for sum
        }
scan.close();
    }
}