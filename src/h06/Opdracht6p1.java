//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Opdracht6p1 extends Applet {
    double a,b;
    double delen;









    public void init() {
        a = 113;
        b = 4;
        delen = a / b;







    }

    public void paint(Graphics g) {
        g.drawString("Marley " + delen,  20, 20);
        g.drawString("Jeannette " +delen, 20, 40);
        g.drawString("Ali "+ delen,  20, 60);
        g.drawString("Jan "+ delen,  20, 80);
    }
}