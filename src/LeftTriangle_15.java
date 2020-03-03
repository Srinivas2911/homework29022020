import java.util.Scanner;

public class LeftTriangle_15 {

    /*15. Display left angle triangle of * using nested for loops
     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void main(String[] args) {
        myLeftTriangle();                   // static method called in main method
    }

    public static void myLeftTriangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Rows : ");     // user input for no. of rows
        int rows = scan.nextInt();
        scan.close();

        for (int i = 0; i < rows; i++) {            //for loop condition
            for (int j = 0; j < rows - i; j++) {    // nested for loop condition
                System.out.print(" ");              //printing blank for spaces
            }
            for (int k = 0; k <= i; k++) {          //for loop condition
                System.out.print("* ");             //printing the character
            }
            System.out.println();               //printing blank for spaces

        }
    }
}
