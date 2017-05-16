import java.util.Scanner;

/**
 * Created by horry on 3/25/2017.
 */
public class Coupon {
    public static int uniform(int N){
        //Generate a random number between 0 and N-1;
        return (int)(Math.random() * N);
    }
    public static int collect(int N){
        //Collect coupons until getting one of each value.
        boolean[] found = new boolean[N];
        int cardcnt = 0, valcount = 0;
        while (valcount < N){
            int val = uniform(N);
            cardcnt++;
            if (!found[val]) valcount++;
            found[val] = true;
        }
        return cardcnt;
    }
    public static void main(String[] args){
        //Print the number of coupons collected to get N different coupons.
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = collect(N);
        System.out.println(count);
    }

}
