package Ho13;

import java.applet.Applet;
import java.awt.*;

public class Oefenen extends Applet {
    double salaris [] = {1,2,3,4,5,6,7,8,9,10};
    double gem;
    double totaal = 0;



    public void init() {
        gemiddeldeBerekenen(salaris);


    }

    public void paint(Graphics g) {
        g.drawString("" + gem,50,50);
    }

    double gemiddeldeBerekenen (double[] hii){
        for (int a = 0; a<hii.length; a++){
            totaal = totaal + salaris[a];
            gem = totaal / salaris.length;

        }

        return gem;

    }


        }










