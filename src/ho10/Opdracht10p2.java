import javax.swing.*;
import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht10p2 extends Applet {

    TextField t1;
    String tekst, tekst1;
    int inputnum, maxnum, minnum;



    public void init() {
        t1 = new TextField("", 30);
        t1.addActionListener(new TextListener());
        add(t1);
        tekst = "";


       minnum = 100000000;



    }

    public void paint(Graphics g) {
        setSize(400, 400);
        t1.setBounds(20, 90, 80, 20);

        g.drawString("Highest number: " + maxnum, 20, 50);
        g.drawString("lowest number: " + minnum, 20, 70);


    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            inputnum = Integer.parseInt(t1.getText());
            repaint();



            if (inputnum > maxnum) {
                maxnum = inputnum;
                repaint();
            }
            if (inputnum < minnum) {
                 minnum = inputnum;
                repaint();
            }
        }
    }
}






























