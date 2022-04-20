package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1f extends JFrame {

    public Exercicio1f(){

        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.f)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        Color cinza = new Color(121, 121, 121);
        Color laranja = new Color(220, 65, 20);

        int [] x1 = {157, 269, 213, 101, 45};
        int [] y1 = {150, 225, 375, 375, 225};

        int [] x2 = {351, 463, 463, 519, 407, 295, 351};
        int [] y2 ={150, 150, 300, 300, 375, 300, 300};


        g.drawRect(0, 0, 800, 600);

        g.drawPolygon(x1, y1, 5);

        g.drawPolygon(x2, y2, 7);

        g.drawOval(530, 150, 225, 225);

        g.setColor(cinza);
        g.fillRect(0, 0, 800, 600);

        g.setColor(laranja);
        g.fillPolygon(x1, y1, 5);

        g.setColor(Color.yellow);
        g.fillPolygon(x2, y2, 7);

        g.setColor(Color.green);
        g.fillOval(530, 150, 225, 225);


    }

    public static void main(String[] args) {

        new Exercicio1f();

    }

}
