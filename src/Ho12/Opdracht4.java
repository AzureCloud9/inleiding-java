package Ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    double getallen [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    TextField tekstvak;
    Button knop;
    String tekst;

    public void init() {
        tekstvak = new TextField("",10);
        add(tekstvak);
        knop = new Button("OK");
        add(knop);
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";

    }

    public void paint(Graphics g) {

        g.drawString(tekst,50,50);

    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int invoernummer = Integer.parseInt(tekstvak.getText());

            boolean gevonden;
            int index = 0;

            gevonden = false;
            for (int a = 0; a<getallen.length; a++){
                if (getallen[a] == invoernummer) {
                    gevonden = true;

                }
            }

            if (gevonden) {
                tekst = "het is gevonden" ;
            } else {
                tekst = "het is niet gevonden";
            }
            repaint();


            }

        }
    }

