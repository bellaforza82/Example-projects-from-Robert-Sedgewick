import java.util.Scanner;

/**
 * Created by horry on 3/31/2017.
 */
public class Hanoi {
    public static void moves(int n, boolean left){
        if (n == 0) return;
        moves(n-1, !left);
        if (left) {
            System.out.println(n + " left");
        }else{
            System.out.println(n + " right");
        }
        moves(n-1, !left);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        moves(n, true);
    }
}
