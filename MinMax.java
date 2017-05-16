/**
 * Created by horry on 3/23/2017.
 */
public class MinMax {
    public static void main(String[] args){
        int min = 0;
        int max = 0;
        while (!StdIn.isEmpty()){
            int placeholder = StdIn.readInt();
            if(placeholder >= 0){
                if (placeholder >= max){
                    max = placeholder;
                }
                if (placeholder <= min){
                    min = placeholder;
                }
            }

        }
        System.out.println("Min is: " + min + " and Max is: " + max);
    }
}
