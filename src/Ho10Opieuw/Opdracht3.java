package Ho10Opieuw;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    TextField tekstvak,tekstvak1;
    Label label, label1;
    String s,d, tekst, tekst1;
    int dag,maand, jaartal;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter:");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(label1);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 200 );
        g.drawString(tekst1, 50, 230 );


        label.setBounds(20,20,300,20);
        tekstvak.setBounds(20,40,300,20);
        label1.setBounds(20,90,300,20);
        tekstvak1.setBounds(20,110,300,20);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari:" + " 31 dagen";
                    break;
                case 2:
                    tekst = "February:" + " 29 dagen";
                    break;
                case 3:
                    tekst = "Maart:" + " 31 dagen";
                    break;
                case 4:
                    tekst = "April:" + " 30 dagen";
                    break;
                case 5:
                    tekst = "Mei:" + " 31 dagen";
                    break;
                case 6:
                    tekst = "Juni:" + " 30 dagen";
                    break;
                case 7:
                    tekst = "Juli:" + " 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus:" + " 31 dagen";
                    break;
                case 9:
                    tekst = "September:" + " 30 dagen";
                    break;
                case 10:
                    tekst = "October:" + " 31 dagen";
                    break;
                case 11:
                    tekst = "November:"+ " 30 dagen";
                    break;
                case 12:
                    tekst = "December:" + " 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
