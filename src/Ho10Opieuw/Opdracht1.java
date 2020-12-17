package Ho10Opieuw;

import javax.swing.*;
import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht1 extends Applet {

    TextField t1;
    String tekst, tekst1;
    int num1, num2,num3;


    public void init() {
        t1 = new TextField("", 30);
        t1.addActionListener(new TextListener());
        add(t1);
        tekst = "";

        num3 = 10;




    }

    public void paint(Graphics g) {
        setSize(400, 400);
        t1.setBounds(20, 60, 80, 20);

        g.drawString("Highest number: " + num2,  20, 50);


    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



            num1 = Integer.parseInt(t1.getText());
            if(num1 >= num2)
                num2 = num1;
            repaint();


        }

    }



}