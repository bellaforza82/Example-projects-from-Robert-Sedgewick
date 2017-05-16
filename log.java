import java.util.Scanner;

/**
 * Created by horry on 3/27/2017.
 */
public class log {
    public static double lg(double N){
        double n = N;
        return 2*Math.log(n);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        System.out.println(lg(n));
    }
}
