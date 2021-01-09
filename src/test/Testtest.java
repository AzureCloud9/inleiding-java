package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class GradeScore extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 30;
        int o = 1;
        for (int i = 1; i < 30; i+=o ){
            g.drawString(""+i, x, y);
            x += 20;
            o ++;

        }


    }
}