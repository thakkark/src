public class Power2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0; 
        int power = 1; 
        while (i <= n) {
            System.out.println(i + " " + power);
            i = i + 1;
            power = 2 * power;
        }


    }
}
