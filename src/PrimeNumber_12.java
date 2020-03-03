import java.util.Scanner;

public class PrimeNumber_12 {

    /*12. Write a programme to input any number and check if it is prime number or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
     */

    public static void main(String []args) {

        myPrimeNumber();                    // calling static method into main method
    }

    public static void myPrimeNumber(){         // static method
        Scanner scan = new Scanner(System.in);
        int i, m, temp = 0;             // defined variables
        int number;
        System.out.println("Enter a number");
        number = scan.nextInt();        //user input
        scan.close();
        m = number / 2;                     // number divisible by 2
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {          // for number starting index at 2
                if (number % i == 0) {          // number divisible by 2,3,etc
                    System.out.println(number + " is not prime number");
                    temp = 1;
                    break;                  // break introduced to stop the loop loop
                }
            }
            if (temp == 0)                  // for all other condition
                System.out.println(number + " is prime number");
        }
    }
}