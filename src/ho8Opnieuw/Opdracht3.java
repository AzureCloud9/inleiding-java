package ho8Opnieuw;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    Button b1;

    TextField t1,t2,t3;

    Label l1;




    public void init() {
        b1 = new Button("Ok");

        t1 = new TextField("",30);


        b1.addActionListener(new ButtonListener());
        l1 = new Label("Btw Calculator");


        add(b1);
        add(t1);
        add(l1);






    }


    public void paint(Graphics g) {
        setSize(500, 500);


    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double n1 =Integer.parseInt(t1.getText());




            if (e.getSource()==b1){
                t1.setText(String.valueOf( n1* 1.21 ));
            }

            repaint();


        }
    }


}



