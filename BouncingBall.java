/**
 * Created by horry on 3/23/2017.
 */
public class BouncingBall {
    public static void main(String[] args){
        //Setting drawing box.
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        //Position
        double rx = .480; double ry = .860;
        //Velocity
        double vx = .015; double vy = .023;
        //Size of ball
        double radius = .05;

        while (true){
            //Move the ball formula
            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;
            //Changing position
            rx = rx + vx;
            ry = ry + vy;

            //Drawing circle.
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show(20);
        }
    }
}
