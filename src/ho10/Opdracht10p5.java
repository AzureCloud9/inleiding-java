package ho10;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10p5  extends Applet {
Button b1;
TextField t1;
String s1;
int getal, sum,totale, nummers;
int avg,count;

    public void init() {
       t1 = new TextField("",30);
       t1.addActionListener(new TextListener());
       add(t1);

       b1 = new Button("klik");
       b1.addActionListener(new KnopListener());
       add(b1);



       s1 = "";
       avg = 0;
       count = 0;


    }

    public void paint(Graphics g) {

        g.drawString("Je resultaat: " + s1, 20,60);
        g.drawString("Je gemiddelde: " + avg, 20,80);
        t1.setBounds(20,20,100,20);
        b1.setBounds(120,20,50,20);




    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



        }


    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            count++;


            String s2;

            s2 = t1.getText();
            getal = Integer.parseInt( s2 );
            if ( getal <= 5 ) {
                s1 = "Je hebt een onvoldoende";
                repaint();
            }
            if (getal >= 6){
                s1 = "je hebt een voldoende";
                repaint();
            }

            if (count>0){
                totale = getal;
                avg = totale / count;
                repaint();
            }
        }
    }

}



