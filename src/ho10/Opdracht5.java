package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    TextField t1;
    String s1;
    Label l1;
    Button b1;
    int number;


    public void init() {
        t1 = new TextField("",5);
        add(t1);
        t1.addActionListener(new FieldListener());

        s1 = "";

        l1 = new Label("Type The Age And Press Enter" );
        add(l1);

    }


    public void paint(Graphics g) {

        g.drawString(s1,50,50);

    }

    class FieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = t1.getText();
            number = Integer.parseInt(s);
                if (number > 5.4){
                s1 = "voldoende.";
                repaint();
            } else {
                s1 = "onvoldoende";
            }
            repaint();


        }
    }
}
