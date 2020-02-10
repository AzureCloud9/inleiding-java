package ho8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht8p1 extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        knop = new Button();
        knop.setLabel("Click on me");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);




    }


    public void paint(Graphics g) {
        setSize(400,400);
        setBackground(Color.white);
        g.drawString("doet deze knop wel iets ?",50,50);

    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}
