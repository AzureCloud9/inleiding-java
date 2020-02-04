package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4p7 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        setSize(500,500);
        setBackground(Color.gray);
        g.setColor(Color.white);
        g.drawRect(250,250,100,100);
        g.fillArc(270,275,20,20,90,360);
        g.fillArc(310,275,20,20,90,360);
        g.fillArc(310,310,20,20,90,360);
        g.fillArc(270,310,20,20,90,360);
    }
}
