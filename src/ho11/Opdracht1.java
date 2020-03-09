package ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int y1 = 0;

        for(teller = 0; teller <= 10; teller++) {
            y+= 10;
            y1+= 100;
            g.drawLine(50,y,300,y1);

        }
    }
}

