import java.util.Scanner;

/**
 * Created by horry on 3/28/2017.
 */
public class Matrix {
    public static int[][] dotProduct(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] * b[i][j];

            }
        }
        return c;
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] < 10) {
                    System.out.print("0" + a[i][j] + " ");
                }else{
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void randomize(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[][] a = new int[T][T];
        int[][] b = new int[T][T];
        randomize(a);
        randomize(b);
        print(a);
        System.out.println();
        print(b);
        System.out.println();
        int[][] c = dotProduct(a,b);
        print(c);

    }

}

