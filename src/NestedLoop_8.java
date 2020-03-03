import java.util.Scanner;

public class NestedLoop_8 {

/* 8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@*/

    public static void main(String[] args) {
        NestedLoop_8 obj = new NestedLoop_8();
        obj.myTriangle();
    }

    public void myTriangle() {
        int c, r, num;  // c for columns, num for number of rows, r for rows

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        num = scan.nextInt();
        scan.close();
        if (num > 1) {
            for (c = 1; c <= num; c++)   // for condition for the columns at index 1
            {
                for (r = 1; r <= c; r++)  // next for loop for row start with index at 1, value increases by 1 for
                    System.out.print("@");    // SOP print statement for @
                System.out.println();     // SOPln print statement for next line.

            }
        }
    }
}