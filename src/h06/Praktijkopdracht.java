package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double a,b,c,d, gemiddelde, plus, tien, vermA, convert, resultaat;
    int tni;

    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        tien = 10;
        plus = a + b + c;
        gemiddelde = plus / d;
        vermA = gemiddelde * tien;
        tni = (int) vermA;
        convert = tni / tien;



    }

    public void paint(Graphics g) {
        setSize(400,400);
        setBackground(Color.white);
        g.drawString("het gemiddelde is: " +convert, 20,20);

    }
}
