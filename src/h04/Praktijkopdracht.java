package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        setSize(500,500);
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20,20,80, 20);
        g.drawString("Lijn",35,30);
        g.drawRect(20,40,100,50 );
        g.drawString("Rechhoek",35,105);
        g.setColor(Color.pink);
        g.fillRect(140,40,100,50);
        g.setColor(Color.black);
        g.drawOval(140,40,100,50);
        g.drawString("Gevulde rechthoek met ovaal",125,105);
        g.setColor(Color.pink);
        g.fillArc(300,40,100,50,360,90);
        g.setColor(Color.black);
        g.drawArc(300,40,100,50,90,360);
        g.drawString("Taartpunt met ovaal eromheen",300,105);
        g.drawRoundRect(20,130,100,50,30,30);
        g.drawString("Afgeronde rechthoek",20,200);
        g.setColor(Color.pink);
        g.fillOval(140,130,100,50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",150,200);
        g.drawArc(300,130,55,55,90,360);
        g.drawString("Circle",300,200);

    }
}
