package Ho11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int a= 0;
        int b= 100;
        int c= 100;
        int hoog = 10;
        int breed = 10;

        while(a < 6){
            g.fillRect(b, c, breed, hoog);
             a++;
            b += 10;
            c += 10;
        }

    }
}
