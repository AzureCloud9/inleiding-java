package ho8Opnieuw;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popdracht extends Applet {

    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    Label l1,l2,l3;

    public void init() {
        b1 = new Button("/");
        b1.addActionListener(new DivideListener());
        add(b1);

        b2 = new Button("x");
        b2.addActionListener(new MultiplyListener());
        add(b2);

        b3 = new Button("-");
        b3.addActionListener(new MinusListener());
        add(b3);

        b4 = new Button("+");
        b4.addActionListener(new PlusListener());
        add(b4);

        t1 = new TextField("",30);
        add(t1);

        t2 = new TextField("",30);
        add(t2);

        t3 = new TextField("",30);
        add(t3);

        l1 = new Label("eerste nummer");
        add(l1);

        l2= new Label("tweede nummer");
        add(l2);


        l3 = new  Label("resultaat");
        add(l3);



    }


    public void paint(Graphics g) {
        setSize(400,400);

        b1.setBounds(250,50,30,30);
        b2.setBounds(250,100,30,30);
        b3.setBounds(250,150,30,30);
        b4.setBounds(250,200,30,30);

        t1.setBounds(125,53,100,25);
        t2.setBounds(125,93,100,25);
        t3.setBounds(125,133,100,25);

        l1.setBounds(20,53,100,25);
        l2.setBounds(20,93,100,25);
        l3.setBounds(20,133,100,25);












    }

    class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int n1 =Integer.parseInt(t1.getText());
            int n2 =Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1/n2));




        }
    }

    class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            int n1 =Integer.parseInt(t1.getText());
            int n2 =Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1*n2));


        }
    }

    class MinusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            int n1 =Integer.parseInt(t1.getText());
            int n2 =Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1-n2));



        }
    }

    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            int n1 =Integer.parseInt(t1.getText());
            int n2 =Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1+n2));



        }
    }
}


