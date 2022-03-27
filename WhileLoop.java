import java.util.Scanner;

/** 
 * This class introduces the concepts of while loops. 
 * @author Krutika Thakkar
 */

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter a number, and we will print 'Hello' this many times: ");
        int input = scan.nextInt(); 
        int index = 0; 

        while (index < input) {
            System.out.println("Hello");
            index++; 
        }
    }
}
