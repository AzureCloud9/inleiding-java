package ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        setSize(500, 500);
        int teller;
        int y = 0;

        for (teller = 10; teller <=20; teller++) {
            y += 20;
            g.drawString("" + teller, 305, y);


        }


    }
}

