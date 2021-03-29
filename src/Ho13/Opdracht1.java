package Ho13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void paint(Graphics g) {
        triangle(50, 150, 100, 75, 150);
    }

    void triangle(int x1, int y1, int x2, int y2, int x3) {
        getGraphics().drawLine(x1, y1, x2, y2);
        getGraphics().drawLine(x2, y2, x3, y1);
        getGraphics().drawLine(x1, y1, x3, y1);
    }
}

