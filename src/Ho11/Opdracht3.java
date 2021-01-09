package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        int a = 100;
        int c = 1;
        int b = 100;
        for (int d = 1; d < 30; d+=c ){
            g.drawString(""+d, a, b);
            a += 20;
            c ++;
        }

    }

}
