/**
 * Created by horry on 3/24/2017.
 */
public class RandomSeq {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];

        for (int i = 0; i < N; i++){
            a[i] = (int)(Math.random() * N);
            StdOut.print(a[i] + " ");
        }
    }
}
