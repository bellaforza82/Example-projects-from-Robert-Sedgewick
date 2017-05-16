/**
 * Created by horry on 3/30/2017.
 */
public class IFS {
    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);
        double[] distribution = StdArrayIO.readDouble1D();
        double[][] cx = StdArrayIO.readDouble2D();
        double[][] cy = StdArrayIO.readDouble2D();
        double x = 0.0, y = 0.0;
        StdDraw.setPenRadius(.01);

        for (int t = 0; t < T; t++){
            int r = StdRandom.discrete(distribution);
            double x0 = cx[r][0]*x + cx[r][1]*y + cx[r][2];
            double y0 = cy[r][0]*x + cy[r][1]*y + cy[r][2];
            x= x0;
            y=y0;
            StdDraw.point(x,y);
        }
    }
}
