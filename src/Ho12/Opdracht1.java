package Ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    double [] Salaris = {1,2,3,4,5,6,7,8,9,10,};
    int y = 20;
    double total,gem;



    public void init() {
        total = 0;

        for (int a = 0; a < Salaris.length; a++){
            total = total + Salaris[a];

        }
        gem = total / Salaris.length;


    }

    public void paint(Graphics g) {
        setSize(500,500);
        for (int a = 0; a < Salaris.length; a++){
            g.drawString("" + Salaris[a],50,y);
            g.drawString("het gemiddelde is " + gem, 100,100 );
            y+=20;
        }



    }

}



