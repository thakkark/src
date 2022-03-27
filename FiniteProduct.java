public class FiniteProduct {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int product = 1; 
        for (int i = 1; i <= n; i++) {
            product = product*i; 
            System.out.println(product);

            /* if n = 4, it should print
            i = 1, product = 1 
            i = 2, product = 2
            i =3, product = 6
            i = 4, product = 24 
            24 is the final answer
            */
        }

    }
}
