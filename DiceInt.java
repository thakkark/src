 /*  Write a program that prints the sum of two random integers between 1 and 
6 (such as you might get when rolling dice) */

public class DiceInt {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;  // (Math.random() * (upper - lower)) + lower; not sure if it should be 5 or 6
        int die2 =  (int) (Math.random() * 6) + 1;
        System.out.println(die1);
        System.out.println(die2);
        System.out.println(die1 + die2);
    }
    
}
