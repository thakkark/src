public class DivisorPattern {
    public static void main(String[] args) {
      int n = Integer.parseInt(args[0]); 
      for (int i = 1; i <= n; i++) {
         // System.out.println(i);
          for (int j = 1; j <= n; j++) {
            if ((i % j == 0) || (j % i == 0)) 
                System.out.println("* "); 
                else 
                System.out.println(" ");
          }
          System.out.println(i);
      }
    }
    
}
