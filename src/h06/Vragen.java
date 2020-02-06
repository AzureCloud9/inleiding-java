/*

                                              VRAGEN

1. Waarom is initialiseren van variabelen noodzakelijk?
A. anders weet je niet welke waarde in een variabele staat

2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?
A. Hiermee zegt de programmeur als het ware tegen de compiler dat hij zich er van
   bewust is dat er informatie verloren kan gaan, maar dat hij dat accepteert.

//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Reken extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}

3. Wat is de uitvoer van dit programma? Geef een verklaring.
A. int heeft de naam a,b,c en a,b,c heeft de waarden van 8,8,3. \
   double heeft de naam uitkomst en het convert de int naar double

4. In de regel uitkomst = (a + b) / c; laat je de ronde haken weg. De regel ziet er dan als volgt uit:
A. ???

5. Wat is de uitvoer van dit programma? Geef een verklaring.
A. ???






 */