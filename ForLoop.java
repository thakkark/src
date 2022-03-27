import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number up to which we will count: ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(i); 
        } */
        int n = Integer.parseInt(args[0]); 
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        
    }
}
