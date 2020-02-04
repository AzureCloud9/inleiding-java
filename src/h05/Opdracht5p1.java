package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5p1 extends Applet {
    Color achtergroundkleur;
    Color text;
    int width;
    int height;

    public void init() {
        achtergroundkleur = Color.gray;
        text = Color.white;
        width = 100;
        height = 200;

    }


    public void paint(Graphics g) {
        setSize(500,500);
        setBackground(achtergroundkleur);
        g.setColor(text);
        g.drawRect(250,250,100,100);
        g.fillArc(270,275,20,20,90,360);
        g.fillArc(310,275,20,20,90,360);
        g.fillArc(310,310,20,20,90,360);
        g.fillArc(270,310,20,20,90,360);
    }
}
