package Ho12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1opnieuw extends Applet {
    double [] Salaris = {1,2,3,4,5,6,7,8,9,10,};
    int y = 20;
    double total,gem;



    public void init() {
        berekenGemiddelde(Salaris);



    }

    public void paint(Graphics g) {
        setSize(500,500);
        for (int a = 0; a < Salaris.length; a++){
            g.drawString("" + Salaris[a],50,y);
            g.drawString("het gemiddelde is " + gem, 100,100 );
            y+=20;
        }

    }

    double berekenGemiddelde(double[] list){
        total = 0;

        for (int a = 0; a < list.length; a++){
            total = total + Salaris[a];

        }
        gem = total / Salaris.length;
        return gem;


    }

}
