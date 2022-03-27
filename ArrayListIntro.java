import java.util.List; 
import java.util.ArrayList;
import java.util.Iterator; 

public class ArrayListIntro {
    public static void main(String[] args) {
        
        List <String> phrases = new ArrayList <String>();
        phrases.add("Hello");
        phrases.add("Bye");
        phrases.add("Yes");

        Iterator itr = phrases.iterator(); 
        while (itr.hasNext()) {
            String str = (String)itr.next();
            if (str.equals("Yes")) {
                itr.remove();
    
            }  else {
                System.out.println(str);
            }
        
    }
}
}