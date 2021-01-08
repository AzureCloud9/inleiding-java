package ho10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField txtfield;
    Button button;
    String string;
    double score;


    public void init() {
        txtfield = new TextField("");
        add(txtfield);
        txtfield.addActionListener(new KoListener());

        button = new Button("Ok");
        add(button);
        string = "Nothing";




    }


    public void paint(Graphics g) {
        if (string == "Ongeldig cijfer!") {
            g.drawString("" + string, 50, 50);
        } else {
            g.drawString("Your Score is: " + string, 50, 50);
        }


      }

    class KoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = txtfield.getText();
            score = Double.parseDouble( s );
            if (score > 10){
                string = "Ongeldig cijfer!";
            }
            if (score <= 3) {
                string = "slecht";
            }
            if (score == 4){
                string = "onvoldoende";
            }
            if (score == 5){
                string = "matig";
            }
            if (score == 6 || score == 7){
                string = "voldoende";
            }
            if (score >= 8 && score <= 10){
                string = "goed";
            }
            repaint();
        }

        }
    }



