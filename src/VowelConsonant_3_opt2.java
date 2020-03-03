import java.util.Scanner;

public class VowelConsonant_3_opt2 {
/*3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
For eg:
Input an alphabet: p Expected Output: Input letter is Consonant
*/
    public static void main(String[] args) {

        myAphabet();
    }

    public static void myAphabet() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input an alphabet (one character) : ");
        char ch = scan.next(".").charAt(0);     // strictly for one character only

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {             // condition for
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + ", input letter is vowel");
            } else
                System.out.println(ch + ", input letter is consonant");

        } else
            System.out.println(ch + " input letter is an Invalid character");
    }
}