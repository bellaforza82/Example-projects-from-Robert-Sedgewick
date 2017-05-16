import java.util.Scanner;

/**
 * Created by horry on 3/31/2017.
 */
public class Browian {
    public static void curve(double x0, double y0,
                             double x1, double y1,
                             double var, double s){
        if (x1 - x0 < .01){
            StdDraw.line(x0, y0, x1, y1);
            return;
        }
        //Find the midpoint of 2 points
        double xm = (x0 + x1) / 2;
        double ym = (y0 + y1) / 2;
        //Difference or change in points randomly generated
        double delta = StdRandom.gaussian(0, Math.sqrt(var));

        //Recursive
        curve(x0, y0, xm, ym+delta, var/s, s);
        curve(xm, ym+delta, x1,y1, var/s, s);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double H = scan.nextDouble();
        double s = Math.pow(2, 2*H);
        //drawing a line in a rectangle
        curve(0, .5, 1.0, .5, .01, s);
    }
}
