package Ho13;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button knop1, knop2;
    boolean knop1knop, knop2knop;

    public void init() {
        knop1 = new Button("Knop1");
        knop2 = new Button("Knop2");
        add(knop1);
        add(knop2);
        knop1.addActionListener(new Knop1Listener());
        knop2.addActionListener(new Knop2Listener());
    }

    public void paint(Graphics g) {
        setSize(1200,720);
        if (knop1knop){
            setKnop1(g,50,100,50,25);
        }
        if (knop2knop){
            setKnop2(g,50,100,50,25);
        }


    }

    void setKnop1 (Graphics g, int x, int y, int width, int height){
        g.setColor(Color.blue);

        for (int a = 0; a < 5;a++) {
            for (int b = 0; b < 13; b++) {
                g.fillRect(x * b + 45 , y, width, height);

            }
            y += height + 2;

    }


    }
    void setKnop2(Graphics g, int x, int y, int width, int height){
        g.setColor(Color.black  );

        for (int a = 0; a < 5;a++) {
            for (int b = 0; b < 13; b++) {
                g.fillRect(x * b + 45 , y, width, height);

            }
            y += height + 2;
    }


}

class Knop1Listener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        knop1knop = true;
        knop2knop = false;
        repaint();


    }
}

class Knop2Listener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        knop2knop = true;
        knop1knop = false;
        repaint();

    }
}
    }
