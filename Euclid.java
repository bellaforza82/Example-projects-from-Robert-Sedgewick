import java.util.Scanner;

/**
 * Created by horry on 3/31/2017.
 */
public class Euclid {
    public static int gcd(int p, int q){
        if (q == 0) return p;
        return gcd(q, p % q);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        int M = scan.nextInt();
        int d = gcd(N,M);
        System.out.println(d);
    }
}
