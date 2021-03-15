package Ho11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    Button knop1;
    TextField tekstvak;
    String text, staat;
    int cijfer;
    Label label;


    public void init() {
        knop1 = new Button("ok");
        tekstvak = new TextField("",10);
        label = new Label("Alleen voor 18+, schrijf hier u leeftijd.");
        add(knop1);
        add(tekstvak);
        add(label);
        text = "";


    }

    public void paint(Graphics g) {
        setSize(500,500);

g.drawString( "" + staat, 100,100);


    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            text = tekstvak.getText();
            cijfer = Integer.parseInt(text);




            }

        }
    }
