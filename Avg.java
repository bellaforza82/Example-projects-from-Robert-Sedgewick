/**
 * Created by horry on 3/20/2017.
 */
public class Avg {
    public static void main(String[] args){
        double sum = 0.0;
        int count = 0;
        while (!StdIn.isEmpty()){
            //Read a number and calculate the sum.
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }
        double avg = sum/count;
        StdOut.println("Average is " + avg);
    }
}
