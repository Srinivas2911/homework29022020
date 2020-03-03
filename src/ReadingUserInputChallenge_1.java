import java.util.Scanner;

public class ReadingUserInputChallenge_1 {
    /*1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
    -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
    -If hasNextInt() returns false, print the message Invalid Number•.
    Continue reading until you have read 10 numbers.
    -Use the nextInt() method to get the number and add it to the sum.
    -Before the user enters each number, print the message •Enter number #x:•
    where x represents the count, i.e. 1, 2, 3, 4, etc.
    -For example, the first message printed to the user would be
     •Enter number #1:•, the next •Enter number #2:, and so on.
    Hint:
    -Use a while loop.
    -Use a counter variable for counting valid numbers.
    -Close the scanner after you don't need it anymore.
    -Create a class with the name ReadingUserInputChallenge.
    */
    public static void main(String[] args) {
        hasNextInt();                       // static method calling in main method
    }

    public static void hasNextInt() {               // hasNextInt method
        Scanner scan = new Scanner(System.in);
        int n = 1;                              // int x defin
        int sum = 0;                            // int sum defined
        boolean hasNextInt;                     // hasNextInt is defined as boolean for int only

        while (n <= 10) {                          // while loop for the no. of entries upto 10

            System.out.println("Enter number #" + n);
            hasNextInt = scan.hasNextInt();        // user input for the number
            n++;                                   // 10 entries one after the other

            if (hasNextInt) {                       // if condition for entries are integers
                int number = scan.nextInt();        // another int number defined to add the numbers
                sum = sum + number;                 // sum becomes sum + the new number.
            } else {                                // else condition
                System.out.println(false + ", Invalid Value");  // prints invalid entry
                System.out.println("Enter the numbers again "); // to print numbers again
                System.exit(n);                     // exits the system
            }
        }
        System.out.println("Sum of the digits is " + sum);   // prints the sum id all conditions are followed
        scan.close();
    }
}
