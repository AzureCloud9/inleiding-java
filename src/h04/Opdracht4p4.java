import java.applet.Applet;
import java.awt.*;

public class Opdracht4p4 extends Applet{

    public void init() {



    }


    public void paint(Graphics g) {
        setSize(600,600);
        setBackground(Color.black);
        g.setColor(Color.white);
        g.fillRect(150,400,15,100);
        g.fillRect(210,300,15,200);
        g.fillRect(270,100,15,400);
        g.drawString("Valerie", 140,520);
        g.drawString("Hans", 200,520);
        g.drawString("Jeroen", 260,520);
        g.drawString("20",100,500);
        g.drawString("40",100,400);
        g.drawString("60",100,300);
        g.drawString("80",100,200);
        g.drawString("100",100,100);



    }
}
