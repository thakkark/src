public class Binary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int power = 1; 
        while (power <= n/2 )
        power *= 2; 
        //Now power is the largest power of 2 <= n 

        while (power > 0) 
        {   //Cast out powers of 2 in decreasing order
            if ( n < power) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
                n -= power; 
            }
                power /= 2; 

        }
        System.out.println( );
    }
    
}
