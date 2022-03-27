public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n/factor; factor++) {
            //Test potential factor
            while (n % factor == 0) {
                //cast out and print factor
                n/= factor; 
                System.out.println(factor + " ");
            } //Any factor of n must be greater than factor
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
    
}
