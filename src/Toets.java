import java.applet.Applet;
import java.awt.*;

public class Toets extends Applet {
    double[] salaris = {500, 203, 193, 134, 7238};
    int y = 20;


    public void init() {

    }


    public void paint(Graphics g) {
        for (int a = 0; a < salaris.length; a++) {
            g.drawString("" + a,50,y);
            y+=20;

        }
    }
}