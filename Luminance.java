import java.awt.Color;

/**
 * Created by horry on 4/5/2017.
 */
public class Luminance {
    public static double luminance(Color color){
        //Compute luminance of color.
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return .299*r + .587*g + .114*b;
    }
    public static Color toGray(Color color){
        //use luminance to convert to greyscale.
        int y = (int) Math.round(luminance(color));
        Color gray = new Color(y,y,y);
        return gray;
    }
    public static boolean isCompatible(Color a, Color b){
        //test if colors are compatible with true false return.
        return Math.abs(luminance(a)-luminance(b)) >= 128;
    }

}
