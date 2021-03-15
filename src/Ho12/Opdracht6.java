package Ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
    int[] nummers = {10,20,40,20,30,50,60,10,20,40,100,20,30,50,20,60,10,20,30,10,50,70};
    TextField tekstvak;
    Button knop;
    String schermtekst;


    public void init() {
        tekstvak = new TextField("",10);
        add(tekstvak);
        knop = new Button("kies");
        add(knop);
        schermtekst = "";
        knop.addActionListener(new Knoplistener());

    }

    public void paint(Graphics g) {
        int y = 80;
        int x = 50;

        g.drawString(schermtekst, x,y);

    }

    class Knoplistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int type=  Integer.parseInt(tekstvak.getText());
            int b = 0;
            boolean found = false;

            for(int a = 0; a < nummers.length; a++){
                if (nummers[a]== type){
                    b++;
                    found = true;
                }
            }
            if (found){
                schermtekst = "waarde komt " + b + "keer voor";
            } else {
                schermtekst = "waarde komt niet voor";
            }
            repaint();

        }
    }
}
