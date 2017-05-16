import java.util.Scanner;

/**
 * Created by horry on 3/31/2017.
 */
public class Recursive {
    //System.exit code -1 means the user input a negative number. User input for the program can only be 0 or a positive number.
    public static int count = 0;
    public static void H(int N){
        if (N == 0) return;
        count++;
        N -= 1;
        H(N);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (true){
            System.out.print("Please enter a positive number: ");
            n = scan.nextInt();
            H(n);
            System.out.println(count);
            System.exit(0);

            }
        }

    }
}
