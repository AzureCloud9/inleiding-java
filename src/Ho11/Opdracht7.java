package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {


    public void init() {
        setSize(1000,1000);

    }


    public void paint(Graphics g) {

        int a = 0;
        int b = 500;
        int c = 500;
        int breed = 10;
        int hoog = 10;
        while (a < 51){




            g.drawOval(b,c,breed,hoog);
            b-= 5;
            c-= 5;
             breed +=10;
            hoog += 10;
            a++;
        }

    }
}
