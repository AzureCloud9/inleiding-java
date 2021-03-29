package Ho12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    String [] namen = new String[10];
    String [] nummers = new String[namen.length];
    Button knop;
    TextField tekstvaknaam, tekstvaknummer;
    int teller = 0;
    int y=20;



    public void init() {
        knop = new Button("Ok");
        add(knop);
        tekstvaknaam = new TextField("naam",10);
        add(tekstvaknaam);
        tekstvaknummer = new TextField("nummer",10);
        add(tekstvaknummer);
        knop.addActionListener(new KnopListener());

    }

    public void paint(Graphics g) {
        setSize(500,500);
        if (teller == namen.length)
            for (int a = 0; a< namen.length; a++){
                g.drawString("" + namen[a] + " " + nummers[a],50,y);
                y+=20;
            }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            namen[teller] = tekstvaknaam.getText();
            nummers[teller] = tekstvaknummer.getText();
            teller++;

            tekstvaknaam.setText("");
            tekstvaknummer.setText("");
            repaint();

        }
    }


}
