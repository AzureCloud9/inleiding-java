import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracgr8p2 extends Applet {
    Button man, vrouw, potman, potvrouw;
    TextField man1, vrouw1, potman1, potvrouw1, totaal;
    Label label;
    int aantalMan, aantalVrouw, aantalJongens, aantalMeisjes, test;


    public void init() {
        man = new Button("Man");
        man.addActionListener(new ManListener());
        man1 = new TextField("0");
        vrouw = new Button("Vrouw");
        vrouw.addActionListener(new VrouwListener());
        vrouw1 = new TextField("0");
        potman = new Button("Pot Man");
        potman.addActionListener(new PotmanListener());
        potman1 = new TextField("0");
        potvrouw = new Button("Pot Vrouw");
        potvrouw.addActionListener(new PotvrouwListener());
        potvrouw1 = new TextField("0");
        totaal = new TextField("0");
        label = new Label("<  totaal");


        add(man1);
        add(man);
        add(vrouw1);
        add(vrouw);
        add(potman1);
        add(potman);
        add(potvrouw1);
        add(potvrouw);
        add(totaal);
        add(label);


        aantalMan = 1;
        aantalVrouw = 1;
        aantalJongens = 1;
        aantalMeisjes = 1;
        test = 1;


    }


    public void paint(Graphics g) {
        setSize(500, 500);


    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man1.setText("" + aantalMan++);
            totaal.setText("" + test++);

            repaint();


        }
    }

    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw1.setText("" + aantalVrouw++);
            totaal.setText("" + test++);

            repaint();


        }
    }

    class PotmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potman1.setText("" + aantalJongens++);
            totaal.setText("" + test++);

            repaint();


        }
    }

    class PotvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potvrouw1.setText("" + aantalMeisjes++);
            totaal.setText("" + test++);


            repaint();


        }
    }

}
