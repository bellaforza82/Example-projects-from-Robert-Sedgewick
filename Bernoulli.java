import java.util.Scanner;

/**
 * Created by horry on 3/31/2017.
 */
public class Bernoulli {
    public static int binomial(int N){
        int heads = 0;
        for (int i = 0; i < N; i++){
            if (StdRandom.bernoulli(0.5)) heads++;
        }
        return heads;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();

        int[] freq = new int[N+1];
        for (int t=0; t <T; t++){
            freq[binomial(N)]++;
        }

        double[] norm = new double[N+1];
        for (int i = 0; i <= N; i++){
            norm[i] = (double) freq[i]/T;
        }
        StdStats.plotBars(norm);
        /*
        double stddev = Math.sqrt(N)/2.0;

        double[] phi = new double[N+1];
        for (int i = 0; i <= N; i++){
            phi[i] = Gaussian.phi(i, mean, stddev);
        }
        StdStats.plotLines(phi);
        */
    }
}
