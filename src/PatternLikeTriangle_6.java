import java.util.Scanner;

public class PatternLikeTriangle_6 {
    /*6. Write a program in Java to display the pattern like triangle with a number.
    For eg.
    Input number of rows: 10
    Expected Output:
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
    */
    public static void main(String[] args) {
        // object creation and method calling into min method
        PatternLikeTriangle_6 obj = new PatternLikeTriangle_6();
        obj.myPattern();
    }

    public void myPattern() {           // instance method

        int c, r, n;  // defined three integers
                        // c for columns, num for number of rows, r for rows

        System.out.println("Enter the number of rows :");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();   // user input for numbers.
        scan.close();
        for (c = 1; c <= n; c++)   // for condition for the columns at index 1
        {
            for (r = 1;r <= c; r++)  // for row start with no. 1, value increases by 1 for
                System.out.print(r);    // SOP print statement for num
                System.out.println();     // Sopln print statemt for next line.
        }
    }
}
