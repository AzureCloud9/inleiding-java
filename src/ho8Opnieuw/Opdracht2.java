package ho8Opnieuw;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    Button knop1;
    Button knop2;
    TextField tekstvak1, tekstvak2;
    Label label;
    String s;




    public void init() {
        knop1 = new Button("Ok");
        knop1.addActionListener(new WerkListener());
        knop2 = new Button("reset");
        knop2.addActionListener(new CrewListener());
        tekstvak1 = new TextField("",30);
        label = new Label("schrijf iets");
        add(knop1);
        add(knop2);
        add(tekstvak1);
        add(label);
        s = "";





    }

    public void paint(Graphics g) {

        g.drawString("en nu kom het op beeld: " + s, 50,50);





    }

    class WerkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            repaint();


        }
    }
    class CrewListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak1.setText("");
            repaint();


        }
    }
}

