package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {
    Color black;
    Color white;

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        int a = 50;
        int b = 50;
        int side = 40, heigh = 50, row = 0, colomn = 0;
        white = Color.white;
        black = (Color.black);

        for (row = 0; row < 4; row++) {
            a = 50;
            b += 50;

            for (colomn = 0; colomn < 8; colomn++) {
                if (colomn == 0 || colomn == 2 || colomn == 4 || colomn == 6) {
                    g.setColor(black);
                    g.fillRect(a, b, side, heigh);
                } else {
                    g.setColor(black);
                    g.fillRect(a, b, heigh, side);
                }

                a += side;
            }

            //tweede rij
            a = 50;
            b += 50;
            for (colomn = 0; colomn < 8; colomn++) {
                if (colomn == 1 || colomn == 3 || colomn == 5 || colomn == 7) {
                    g.setColor(black);
                    g.fillRect(a, b, side, heigh);
                } else {
                    g.setColor(white);
                    g.fillRect(a, b, heigh, side);
                }

                a += side;
            }


        }
    }
}
