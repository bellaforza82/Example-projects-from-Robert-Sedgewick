import java.util.Scanner;

/**
 * Created by horry on 3/27/2017.
 */
public class Max {
    private static boolean result;

    public static void ThreeMax(double a, double b, double c){
        double aa = a, bb = b,cc = c;
        double[] array = {aa, bb, cc};
        double max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
    public static boolean odd(boolean a, boolean b, boolean c){
        boolean aa = a, bb =b, cc =c;
        Scanner scan = new Scanner(System.in);
        int cnt=0;
        while (scan.hasNextBoolean()){
            if (scan.nextBoolean() == true){
                cnt++;
            }
        }
        if (cnt == 1 || cnt == 3){
            return true;
        }else{
            return false;
        }


    }
    public static boolean majority(boolean a, boolean b, boolean c){
        boolean aa = a, bb = b, cc = c;
        boolean[] array = {aa,bb,cc};
        int i = 0;
        int count = 0;
        while(i < array.length){
            while (array[i] == true){
                count++;
                break;
            }
            i++;
        }
        while(count >= 2){
            result = true;
            break;
        }
        while(count <= 1){
            result =  false;
            break;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean a = scan.nextBoolean(), b = scan.nextBoolean(), c = scan.nextBoolean();
        majority(a,b,c);
        System.out.println(result);
        scan.close();
    }
}
