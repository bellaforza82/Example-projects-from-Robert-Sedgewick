/**
 * Created by horry on 3/30/2017.
 */
public class RandomPoints {
    public static void main(String[] args){
        StdDraw.setPenRadius(.005);
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++){
            double x = StdRandom.gaussian(.5, .2);
            double y = StdRandom.gaussian(.5, .2);
            StdDraw.point(x, y);
        }
    }
}
