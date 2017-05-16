/**
 * Created by horry on 3/24/2017.
 */
public class Transition {
    public static void main(String[] args){
        //Print random-surfer probabilities.
        int N = Integer.parseInt(args[0]);
        int[][] counts = new int[N][N];
        int[] outDegree = new int[N];


        while (!StdIn.isEmpty()){
            //Accumulate link counts.
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            if (counts[i][j] > 0) {
                if (counts[i][j] == counts[i-1][j-1]){
                    break;
                }
            }
            outDegree[i]++;
            counts[i][j]++;
        }

        StdOut.println(N + " " + N);
        for (int i = 0; i < N; i++){
            //Print probability distribution for row i.
            for (int j = 0; j < N; j++){
                //Print probability for column j.
                double p = .95*counts[i][j]/outDegree[i] + .05/N;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}
