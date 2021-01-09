package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {



    public void init() {

    }


    public void paint(Graphics g) {
        int a = 0;
        int b = 100;
        int c = 100;
        int breed = 20;
        int hoog = 20;
        while (a < 101) {




            g.drawOval(b, c, breed, hoog);
            b += 0;
            c += 0;
            breed += 20;
            hoog +=20;
            a++;
        }
    }
}
