import java.util.Scanner;

/**
 * Created by horry on 3/25/2017.
 */
public class Arguments {
    static Scanner scan = new Scanner(System.in);
    public static int max3(int a, int b, int c){
        int max = 0;
        if (a > b && a > c){
            max = a;
        }
        if (b > a && b > c){
            max = a;
        }
        if (c > b && c > a){
            max = a;
        }
        return max;
    }
    public static double max3(double a, double b, double c){
        double[] array = new double[{a,b,c}];
        double max = 0;
        int count = 0;
        for (int i = 0; i < 3; i++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }
    public static void main(String[] args){
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println(max3(a,b,c));
    }
}
