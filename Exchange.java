import java.util.Scanner;

/**
 * Created by horry on 3/25/2017.
 */
public class Exchange {
    public static void exch(String[] a, int i, int j){
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void print(String[] a){
        for (int i = 0; i < 10; i ++){
            if (a[i] != null) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        String[] a = new String[10];
        while (scan.hasNext()){
            a[cnt] = scan.next();
            cnt++;
        }
        print(a);
        System.out.println();
        exch(a,1,0);
        print(a);

    }
}
