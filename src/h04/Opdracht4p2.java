//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht4p2 extends Applet {

    public void init() {
    }
''
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        setSize(400,400);
        g.drawRect(20, 100, 200, 150);
        g.drawRect(40, 180, 35, 70);
        g.drawRect(160, 150, 45, 45);
        g.drawLine(185,150,185,195);


    }

}