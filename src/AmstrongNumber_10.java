import java.util.Scanner;

public class AmstrongNumber_10 {
    /*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3) where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 So: 1+125+27=153

Armstrong number is a number that is equal to the sum of cubes of its digits.
Examples : 0, 1 153, 370, 371, 407
 */

    public static void main(String[] args) {            //main method
        AmstrongNumber_10 obj = new AmstrongNumber_10();
        obj.myAmstrong();                           // instance method called in main method
    }

    public void myAmstrong(){                       // instance method
        int c = 0, a, temp;                         // three variable with one temp variable
        int n;                                      //It is the number to check armstrong
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check armstrong : ");
        n = scan.nextInt();                             // user input
        scan.close();

        temp = n;                                // number put in temp.
        while (n > 0) {                         // whole loop
            a = n % 10;                         // getting remainder
            n = n / 10;
            c = c + (a * a * a);                // when c = 0, digits a will be cubed in loop and added to the number
        }
        if (temp == c)
            System.out.println(temp + " is an armstrong number");
        else
            System.out.println(temp + " is Not an armstrong number");
    }
}

