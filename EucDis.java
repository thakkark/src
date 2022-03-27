public class EucDis {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        int y = Integer.parseInt(args[1]); 
        double z = (x*x)+(y*y);
        double distance = Math.sqrt(z);
        System.out.println(distance);

    }
}
