public class FibonacciNumbers_9 {

    /*    9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     */

    public static void main(String[] args) {
        myFibonacci(4);      // static method calling in main method
    }

    public static void myFibonacci(int count) {

//        Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the no. counts :");
//           count = scan.nextInt();  // user input for

        int n1 = 1, n2 = 1, n3, i;
        if (count >= 0) {
            System.out.print("The fibonacci numbers are " + n1 + " " + n2);//printing 1
            for (i = 1; i < count; ++i)//loop starts from 2 because 1 is already printed
            {
                n3 = n1 + n2;          // fibonacci number addition
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        } else {
            System.out.println("invalid request");
        }
    }
}