package ho10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    String string, text1, text2;
    int year, day;
    TextField txtfield,txtyear;
    Label l1;



    public void init() {
        txtyear = new TextField("",50);
        txtfield = new TextField("",60);
        text1 = "";
        text2 = "";
        l1 = new Label("type the year number and press enter");
        add(l1);
        add(txtyear);
        txtfield.addActionListener(new TextListener());
        add(txtfield);
        txtyear.addActionListener(new YearListener());

    }


    public void paint(Graphics g) {
        g.drawString(text1,50,50);
        g.drawString(text2,50,60);

    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = txtfield.getText();
            year = Integer.parseInt(string);
            day = Integer.parseInt(string);
            switch(day) {
                case 1:  text1 = "januari 31 dagen";
                    break;
                case 2: text1 = "februari 29 dagen";
                    break;
                case 3: text1 = "maart 31 dagen";
                    break;
                case 4: text1 = "april 30 dagen";
                    break;
                case 5: text1 = "mei 31 dagen";
                    break;
                case 6:
                    text1 = "juni 30 dagen";
                    break;
                case 7:
                    text1 = "juli 31 dagen";
                    break;
                case 8:
                    text1 = "augustus 31 dagen";
                    break;
                case 9:
                    text1 = "september 30 dagen";
                    break;
                case 10:
                    text1 = "oktober 31 dagen";
                    break;
                case 11:
                    text1 = "november 30 dagen";
                    break;
                case 12:
                    text1 = "december 31 dagen";
                    break;


            }
        }
    }

    class YearListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            text2 = txtyear.getText();
            year = Integer.parseInt(string);
            switch(year){

                case 2012:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2016:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2020:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2024:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2028:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2032:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2036:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";
                    break;
                case 2040:
                    text2 = "schrikkeljaar"+ " 31 januari   29 februari  31 maart  30 april  31 mei  30 juni  31 juli 31 augustus 30 september 31 oktober 31 december ";

                repaint();
            }
        }
        }
}


