import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by horry on 3/25/2017.
 */
public class PlayTune2 {
    public static double[] sum(double[] a, double b [], double awt, double bwt){
        //Superpose aa and b weighted (harmonics).
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++){
            //create 2 new sound waves and combine them to produce harmonics.
            c[i] = a[i]*awt + b[i]*bwt;
        }
        return c;
    }
    public static double[] tone(double hz, double t){
        int sps = 44100;
        int N = (int)(sps*t);
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++){
            a[i] = Math.sin(2 * Math.PI * i  * hz / sps);
        }
        return a;
    }
    public static double[] note(int pitch, double t){
        //Play note of given pitch, with harmonics.
        double hz = 440.0 * Math.pow(2, pitch/ 12.0);
        double[] a = tone(hz, t);
        double[] hi = tone(2*hz, t);
        double[] lo = tone(hz/2, t);
        double[] h = sum(hi,lo,.5,.5);
        return sum(a, h, .5, .5);
    }
    public static void main(String[] args){
        File inFile = new File("C:/myworks/PlayTune2/src/elise.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scan.hasNext()){
            int pitch = scan.nextInt();
            double duration = scan.nextDouble();
            double[] a = note(pitch, duration);
            StdAudio.play(a);
        }
    }
}
