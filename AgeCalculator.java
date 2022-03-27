/**
 * This class interacts with the user to tell them their age in months, days, and minutes.
 * @author Krutika Thakkar
 */

//IMPORTS 
import java.util.Scanner;

public class AgeCalculator {
public static void main(String[] args) {

    System.out.print("Enter your age: ");
    
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt(); 

    int months = age * 12; 
    int days = age * 365; 
    int minutes = days * 24 * 60; 

    System.out.print("You are " + months + " months old, ");
    System.out.print(days + " days old, ");
    System.out.print("and " + minutes + " minutes old!");
}
}
