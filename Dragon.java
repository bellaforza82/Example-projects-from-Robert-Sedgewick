/**
 * Created by horry on 3/24/2017.
 */
public class Dragon {
    public static void main(String[] args){
        String dragon = StdIn.readString();
        String nogard = StdIn.readString();
        StdOut.print(dragon + "L" + nogard);
        StdOut.print(" ");
        StdOut.print(dragon + "R" + nogard);
        StdOut.println();
    }
}
