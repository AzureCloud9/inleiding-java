package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {
        int a = 0;
        int b = 20;
        int c = 20;
        while (a < 10){
            g.drawLine(b,c,50,c);
            c += 20;
            a++;
        }


        }
    }



