//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht4p1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(70,70,100,120);
        g.drawLine(70,70,50,120);
        g.drawLine(50, 120, 100, 120);

    }
}