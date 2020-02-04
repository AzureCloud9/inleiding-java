import java.applet.Applet;
import java.awt.*;

public class Opdracht5p2 extends Applet{
    // wat is wat
    int valerie;
    int hans;
    int jeroen;
    Color vkleur;
    Color hkleur;
    Color jkleur;

    public void init() {
//waarde
        valerie = 500;
        hans = 200;
        jeroen = 100;
        vkleur = Color.pink;
        hkleur = Color.yellow;
        jkleur = Color.white;



    }


    public void paint(Graphics g) {
        setSize(600,600);
        setBackground(Color.black);
        g.setColor(vkleur);
        g.fillRect(150,400,15,100);
        g.setColor(hkleur);
        g.fillRect(210,300,15,200);
        g.setColor(jkleur);
        g.fillRect(270,100,15,400);
        g.drawString("Valerie", 140,520);
        g.drawString("Hans", 200,520);
        g.drawString("Jeroen", 260,520);
        g.drawString("20",100,500);
        g.drawString("40",100,valerie);
        g.drawString("60",100,300);
        g.drawString("80",100,hans);
        g.drawString("100",100,jeroen);



    }
}
