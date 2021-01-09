package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
         int a = 100;
        int b = 100;
        for (int c = 3; c < 33; c+=3 ) {
            g.drawString("" + c, a, b);
            a += 20;
        }

    }
}
