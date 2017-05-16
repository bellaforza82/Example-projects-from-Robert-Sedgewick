import java.util.Scanner;

/**
 * Created by horry on 3/27/2017.
 */
public class IsATri {
    public static boolean isATri(int a, int b, int c){
        int aa = a, bb = b, cc = c;
        boolean isATriangle = false;
        while(aa <= (bb+cc)){
            isATriangle = true;
            while(bb <= (aa+cc)){
                isATriangle = true;
                while(cc <= (aa+bb)){
                    isATriangle = true;
                    break;
                }
                break;
            }
            break;
        }
        return isATriangle;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        System.out.println(isATri(a,b,c));
    }
}
