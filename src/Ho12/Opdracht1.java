package Ho12;



import java.applet.Applet;
import java.awt.*;

    public class Opdracht1 extends Applet {
        double[] salaris = {1000, 600, 5899, 2789, 500, 1299,492,2949,7000,2012};
        double total, gemiddelde;
        int y = 20;


        public void init() {
            for ( int a = 0; a < salaris.length; a++){
                total = total + salaris[a];
                gemiddelde = total / salaris.length;
            }




        }

        public void paint(Graphics g) {
            setSize(500,500);
            for (int a = 0; a < salaris.length; a++){
                g.drawString(""+ salaris[a],50,y);
                y+=20;
            }
            g.drawString( "het gemiddelde is: " + gemiddelde,50,50);



        }

    }


