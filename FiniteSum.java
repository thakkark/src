public class FiniteSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i + sum; 
        System.out.println(sum); 
        }

        /* suppose n is 4, it should print: 
        i = 1, sum = 1 
        i = 2, sum = 3
        i = 3, sum = 6
        i = 4, sum = 10 
        10 is the final answer
            */

    }
}
