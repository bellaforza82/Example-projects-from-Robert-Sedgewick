import java.util.Scanner;

/**
 * Created by horry on 3/28/2017.
 */
public class BinarySearch {
    public static int N;
    public static int M;
    public static Scanner scan = new Scanner(System.in);
    public static int[] creatArray(int N){
        int i = 0;
        int[] a = new int[N];
        while (i < N){
            a[i] = i;
            i++;
        }
        return a;

    }
    public static int bSearch(int[] a){
        int hi = a.length;
        int lo = 0;
        int mid = a.length/2;
        for (int i = lo; i < hi; i++){
            if (a[i] > M){
                lo = mid+1;
            }else if (a[i] < M){
                hi = mid-1;
            }else{
                i = M;
                break;
            }
        }
    }
    public static void main(String[] args){
        N = scan.nextInt();
        M = scan.nextInt();
        int[] a = creatArray(N);
        System.out.println(bSearch(a));



    }
}
