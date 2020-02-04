package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4p3 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        setSize(500, 500);
        g.setColor(Color.white);
        g.fillRect(250,250,5,100);
        g.setColor(Color.red);
        g.fillRect(255, 250,50,10);
        g.setColor(Color.white);
        g.fillRect(255,260,50,10);
        g.setColor(Color.blue);
        g.fillRect(255,270,50,10);

    }
}
