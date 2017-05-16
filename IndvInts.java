import java.util.Scanner;

/**
 * Created by horry on 3/23/2017.
 */
public class IndvInts {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int n = 0;
        while (scan.hasNextInt()){
            a[n] = scan.nextInt();
            n++;
        }
        for (int i = 0; i <= n; i++) {
            if (a[i] == a[i + 1] || a[i] == a[i-1]) {
                for (int j = i; j <= n; j++){
                    a[j] = a[j+1];
                }
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }
    }
}
