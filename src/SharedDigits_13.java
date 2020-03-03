import java.util.Scanner;

public class SharedDigits_13 {
 /*
 13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
  */

    public static void main(String[] args) {

        hasShareDigit(14, 17)  ;                      // static method calling in main method
    }

    public static void hasShareDigit(int a, int b) {            // static method

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = scan.nextInt();                                 // user input for first number a

        System.out.println("Enter the second number : ");
        b = scan.nextInt();                                // user input for second number b
        scan.close();

        int firsta = a / 10;                            // new variable firsta for first digit
        int seconda = a % 10;                           // firstb for modulus of 10, remainder digit
        int firstb = b / 10;                            // new variable seconda for first digit
        int secondb = b % 10;                           // secondb for modulus of 10, remainder digit
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {     // condition for nos between 10 -99 inclusive
            // mapping digit to digit for sharing
            if (firsta == firstb || firsta == secondb || seconda == firstb || seconda == secondb)
            //return true; (for boolean method)
            System.out.println(true + "," + a + " & " + b + " have shared digits"); // if true, print stattement
            else
            //return false;
               System.out.println(false + "," + a + " & " + b + " do NOT have shared digits");// false statement
        }else
            //return false;
            System.out.println(false+", Please enter numbers from 10 to 99 only");// for nos. less than 10 or more than 99
    }
}
