//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Opdracht6p2 extends Applet {
    int a , b ,c,d,e, seconden, uur,  dag, maand, jaar;


    public void init() {
        a = 1; // a = seconden /
        b = 60; // b = uur /
        c = 24; // c = dag /
        d = 31; // d = maand /
        e = 12;  // jaar
        uur = a * b;
        dag = c * b;
        maand = dag * b;
        jaar = maand * b;


    }

    public void paint(Graphics g) {
        g.drawString("Er zit " + uur + " seconden in een uur",  20, 20);
        g.drawString("Er zit " + dag + " seconden in een dag",  20, 40);
        g.drawString("Er zit " + maand + " seconden in een maand",  20, 60);
        g.drawString("Er zit " + jaar + " seconden in een jaar",20,80);

    }
}