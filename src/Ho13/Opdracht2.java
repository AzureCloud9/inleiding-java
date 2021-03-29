package Ho13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init() {
        setSize(1400, 600);
    }

    public void paint(Graphics g) {
        tekenMuur(g, 50, 100, 50, 25);
    }

    void tekenMuur(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.blue);

        for (int a = 0; a < 5;a++) {
            for (int b = 0; b < 13; b++) {
                g.fillRect(x * b + 45 , y, width, height);

            }
            y += height + 2;

        }
    }
}

