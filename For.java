import java.util.function.Function;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) { //10
            name();
            System.out.println("1");
        }
    }
    public static void name() {
        for (int j = 0; j < 4; j++) { //10
           lastname();
           System.out.println("2");
        }
    }
    public static void lastname() {
        for (int j2 = 0; j2 <3; j2++) {//20
                System.out.println("3");
        }
    }
}
