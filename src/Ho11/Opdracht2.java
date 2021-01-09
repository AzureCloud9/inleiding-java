package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        int a = 0;
        int b = 20;
        int c = 20;
        while (a < 21 ){
            g.drawString(""+a,b,c);
            c+=20;
            a++;
        }

    }
}
