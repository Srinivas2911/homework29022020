import java.util.Scanner;

public class DiamondPattern_14 {

    /*14. Write a program in Java to display the pattern like a diamond.
While loop
            *
           ***
          *****
         *******
        *********
       ***********
      *************
       ***********
        *********
         *******
          *****
           ***
            *

*/

    public static void main(String[] args) {

        myDiamondPattern();             // static method called directly
    }

    public static void myDiamondPattern() {     // static method


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of rows : ");
        int n = scan.nextInt();               // user input for no of rows (n)

        System.out.println("Enter the character : ");
        char ch = scan.next().charAt(0);      // user input for type of character to print in console
        scan.close();

        int i = 1;                      // int i for rows
        int j;                          // j for columns
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");      // SOP print blank in the columns
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);       // SOP print character chosen
            }
            System.out.println();           //
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }

    }
}
