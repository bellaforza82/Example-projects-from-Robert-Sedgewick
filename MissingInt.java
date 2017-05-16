import java.util.Scanner;

/**
 * Created by horry on 3/23/2017.
 */
public class MissingInt {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 1; i < N; i++){
            a[i] = i;
        }
        a[(int)(Math.random() * N)] = 0;

        for (int i = 1; i < N; i++){
            if (a[i] != i){
                System.out.println(i + " is the missing integer!");
            }
        }
    }
}
