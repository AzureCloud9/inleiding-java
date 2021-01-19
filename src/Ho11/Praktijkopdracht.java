package Ho11;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Button knop;
    int tafel, keer, result, start, a;

    public void init() {
        tekstvak = new TextField("", 11);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }


    public void paint(Graphics g) {
        a = 50;
        if (start == 1) {
            keer = 1;
            while (keer <= 10) {
                result = tafel * keer;
                g.drawString("" + keer + " x " + tafel + " = " + result, 50, a);
                a += 15;
                keer++;

            }
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            if (s != "") {
                start = 1;
            }
            tekstvak.setText("");
            repaint();}}}