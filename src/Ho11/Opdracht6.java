package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

         int a = 0;
        int b = 100;
        int c = 100;
        int hoog = 15;
        int breed = 15;

        while (a < 6) {
            g.drawOval(b,c,breed,hoog);
            b -= 10;
            c -= 10;
            breed+= 15;
            hoog += 15;
            a++;
        }

    }
}
