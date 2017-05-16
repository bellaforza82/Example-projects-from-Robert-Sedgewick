import java.util.Scanner;

/**
 * Created by horry on 3/28/2017.
 */
public class BooleanArrays {
    private static int N;
    public static boolean[] createArray(int N){
        boolean[] a = new boolean[N];
        int i = 0;
        boolean bool;
        while (i < N){
            while (Math.random() >= .5) {
                bool = false;
                a[i] = bool;
                i++;
            }
            while (Math.random() < .5) {
                bool = true;
                a[i] = bool;
                i++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        boolean[] a = createArray(N);
        int i = 0;
        while (i < a.length){
            System.out.println(a[i]);
            i++;
        }
    }
}
