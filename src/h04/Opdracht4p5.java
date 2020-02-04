package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4p5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setSize(400,400);
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.fillArc(200,200,100,100,199,100);
    }
}
