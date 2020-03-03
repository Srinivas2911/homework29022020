import java.util.Scanner;

public class DigitSumChallenge_4 {
    /*4. Digit Sum Challenge
    Write a method with the name sumDigits that has one int parameter called number.
    If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
    The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process negative numbers, so also return -1 for negative numbers.
    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    Calling the method sumDigits(1) should return -1 as per requirements described above.
    Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
    Hint: Use n % 10 to extract the least-significant digit.
    Use n = n / 10 to discard the least-significant digit.
    The method needs to be static
    Create a class with the name DigitSumChallenge.
    */
    public static void main(String[] args) {
                                // static method calling in main method
        System.out.println(" Sum of the digits is : " + sumDigits(9));
    }

    private static int sumDigits(int number) {          // static method

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = scan.nextInt();                        // user input for the number
        scan.close();

        if (number < 10) {                  // if number less then 10, return -1
            return -1;
        }
        int sum = 0;                        // defined another integer for sum of the digits
        while (number > 0) {                // for all cases when number is more then 10

            int digit = number % 10;        //Extract the least-significant digit
            number = number / 10;           //Drop the least-significant digit
            sum = sum + digit;              // sum of the digits

        }
        return sum;                         // return the sum
    }
}
