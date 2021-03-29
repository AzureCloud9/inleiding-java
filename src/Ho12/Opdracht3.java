package Ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    TextField tekstvak [] = new TextField[5];
    Button knop;
    double [] nummers = new double[5];



    public void init() {


        for (int a = 0; a< tekstvak.length; a++){
            tekstvak[a] = new TextField("",10);
            add(tekstvak[a]);
        }
        knop = new Button("OK");
        add(knop);
        knop.addActionListener( new KnopListener() );

    }


    public void paint(Graphics g) {
    }


    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int a = 0; a< tekstvak.length; a++){
                nummers[a] = Integer.parseInt(tekstvak[a].getText());
            }
            Arrays.sort(nummers);

            for (int a = 0; a< nummers.length; a++){
                tekstvak[a].setText(String.valueOf(nummers[a]));
            }



        }
    }

}