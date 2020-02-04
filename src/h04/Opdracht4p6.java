package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4p6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setSize(500,500);
        setBackground(Color.gray);
        g.setColor(Color.white);
        g.drawRect(200,200,100,250);
        g.setColor(Color.green);
        g.fillArc(225,250,50,50,90,360);
        g.setColor(Color.orange);
        g.fillArc(225,310,50,50,90,360);
        g.setColor(Color.red);
        g.fillArc(225,370,50,50,90,360);


    }
}
