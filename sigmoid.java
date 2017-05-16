import java.util.Scanner;

/**
 * Created by horry on 3/27/2017.
 */
public class sigmoid {
    public static double sig(double a){
        double aa = a;
        return 1/(1-(Math.pow(2.71827, -aa)));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        System.out.println(sig(n));

    }
}
