/**
 * Created by horry on 4/4/2017.
 */
public class VertPercolation {
    public static boolean[][] flow(boolean[][] open){
        int N = open.length;
        boolean[][] full = new boolean[N][N];
        for (int j =0; j < N; j++){
            full[0][j] = open[0][j];
        }
        for (int i = 1; i < N; i++){
            for (int j = 0; j < N; j++){
                full[i][j] = open[i][j] && full[i-1][j];
            }
        }
        return full;
    }
}
