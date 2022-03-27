//IMPORTS
import java.util.Scanner;

/** 
 * This class compares a number that the user inputs to another number.
 * Then it tells us whether the input number is greater than, equal to, or less than 
 * the number the user has input. 
 * @author Krutika Thakkar 
 */

public class Comparison {
    public static void main(String[] args) {
        //Create scanner object 
        Scanner scan = new Scanner(System.in);

        //Ask user for a number 
        System.out.print("Enter a number: ");

        //Assign this number to a variable 
        int num = scan.nextInt();

        //System.out.println(num);

        if (num < 10) {
            System.out.println(num + " is less than 10.");
        }
        else if (num > 10) {
            System.out.println(num + " is greater than 10.");
        }
        else {
            System.out.println(num + " is equal to 10.");
        }
    }
}
