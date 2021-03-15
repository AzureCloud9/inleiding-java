package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {
    int y = 20;

    public void init() {


    }


    public void paint(Graphics g) {
        setSize(500,500);
        for (int a = 0; a < 10; a++){
            g.drawString("" + a,50,y);
            y+=20;

        }

        }

    }

