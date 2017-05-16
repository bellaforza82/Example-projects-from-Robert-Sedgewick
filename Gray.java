import java.util.Scanner;

/**
 * Created by horry on 3/31/2017.
 */
public class Gray {
    public static void moves(int n, boolean enter){
        if (n == 0) return;
        moves(n-1, true);
        if (enter) {
            System.out.println("enter" + n);
        }else{
            System.out.println("exit" + n);
        }
        moves(n-1, false);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        moves(n, true);
    }
}
