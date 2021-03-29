package Ho12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button knop [] = new Button[25];


public void init() {
    for (int a = 0; a< knop.length; a++){
        knop[a] = new Button("ok");
        add(knop[a]);
    }


    }

    public void paint(Graphics g) {

    }
}
