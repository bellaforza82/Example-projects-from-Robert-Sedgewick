/**
 * Created by horry on 3/28/2017.
 */
public class duplicate {
    public static String duplicate(String t){
        String s = t + t;
        return s;
    }
    public static void main(String[] args){
        String s = "hello";
        s = duplicate(s);
        String t = "bye";
        t = duplicate(duplicate(duplicate(t)));
        System.out.println(s+t);
    }
}
