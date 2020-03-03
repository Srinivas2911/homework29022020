import java.util.Scanner;

public class SumEvenDigits_11 {
/*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
*/
    public static void main(String[] args) {

        getEvenDigits(0);           // static method calling in main method
    }

    public static void getEvenDigits(int number) {
        int r, s = 0;                           // defined int

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number :");
        number = scan.nextInt();        // user input for aa number
        scan.close();

        if (number >= 0) {                  // if all numbers more tan equal to 0
            while (number > 0) {            // while loop to pick all even nos.
                r = number % 10;            // getting remainder
                number = number / 10;
                if (r % 2 == 0)             // for all even number
                    s = s + r;              // sum of all even digits
            }
            System.out.println("Sum of the even digits : " + s);
        }else
            System.out.println(-1+", Invalid number, enter nos greater than 0");
    }
}
