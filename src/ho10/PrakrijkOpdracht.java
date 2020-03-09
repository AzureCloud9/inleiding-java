package ho10;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrakrijkOpdracht extends Applet {

    TextField tekstvak;
    int inputNum;
    String tekst;


    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TextListener());
        add(tekstvak);

        tekst = "";

    }

    public void paint(Graphics g) {
        tekstvak.setBounds(20, 30, 100, 20);
        g.drawString("Je hebt een: " + tekst, 20, 80);

    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String nummer;
            repaint();

            nummer = tekstvak.getText();
            inputNum = Integer.parseInt(nummer);

            if (inputNum < 3) {
                tekst = "Slecht cijfer";
                repaint();
            }
            if (inputNum == 4) {
                tekst = "Onvoldoende cijfer";
                repaint();
            }
            if (inputNum == 5) {
                tekst = "Matig cijfer";
                repaint();
            }
            if (inputNum == 6) {
                tekst = "Voldoende cijfer";
                repaint();
            }if (inputNum == 7) {
                tekst = "Voldoende cijfer";
                repaint();
            }
            if (inputNum == 8) {
                tekst = "Goed cijfer";
                repaint();
            }
            if (inputNum == 9) {
                tekst = "Goed cijfer";
                repaint();
            }
            if (inputNum == 10) {
                tekst = "Goed cijfer";
                repaint();
            }
        }

    }
}