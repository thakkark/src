/**
 Write a program that takes two integer command-line arguments a and b
and prints a random integer between a and b, inclusive
 **/
public class RandomInt2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]);
        int r = (int) (Math.random() * (b-a +1)) + a ;
        System.out.println(r);
    }
    
}
