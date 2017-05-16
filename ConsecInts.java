import java.util.Scanner;

/**
 * Created by horry on 3/23/2017.
 */
public class ConsecInts {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int n = 0;
        while (scan.hasNextInt()){
            a[n] = scan.nextInt();
            n++;
        }
        int count = 1;
        int[] b = new int[10];
        for (int i = 0; i < n; i++){
            if (a[i] == a[i+1]){
                count++;
                b[i] = count;
            }
        }
        int max = 0;
        int place = 0;
        for (int i = 0; i <=n; i++){
            if (b[i] >= max){
                max = b[i];
                place = a[i];
            }
        }
        System.out.println("Longest run: " + max + " consecutive " + place + "'s.");
    }
}
