import java.applet.Applet;
import java.awt.*;

public class Opdracht6p3 extends Applet{
    int a, b, test;


    public void init() {


        a = 2147483647;
        b = 2;
        test = a * b;





    }


    public void paint(Graphics g) {
        setSize(400,400);
        setBackground(Color.gray);
        g.drawString("De resultaat is"+test,20,20 );


    }
}