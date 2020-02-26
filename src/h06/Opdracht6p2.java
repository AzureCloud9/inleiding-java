//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Opdracht6p2 extends Applet {
    int a , b ,c,d,e,f, seconden, uur,  dag, maand, jaar;


    public void init() {
        a = 1; // a = seconden /
        b = 60; // b = minute
        c = 3600; // c = uur
        d = 86400; // d = dag /
        e = 2629800 ; // e = maand /
        f = 31557600;  // f = jaar




    }

    public void paint(Graphics g) {
        g.drawString("Er zit " + c + " seconden in een uur",  20, 20);
        g.drawString("Er zit " + d + " seconden in een dag",  20, 40);
        g.drawString("Er zit " + e + " seconden in een maand",  20, 60);
        g.drawString("Er zit " + f + " seconden in een jaar",20,80);

    }
}