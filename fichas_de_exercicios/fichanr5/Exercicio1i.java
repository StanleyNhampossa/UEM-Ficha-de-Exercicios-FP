package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1i extends JFrame {

    public Exercicio1i(){

        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.i)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        g.drawOval(325, 50,150, 150);

        g.drawLine(400, 200, 400, 450);

        g.drawLine(400, 450, 350,500);
        g.drawLine(400, 450, 450, 500);

        g.drawLine(400, 325, 350, 375);
        g.drawLine(400, 325,450, 375);

        g.drawArc(350, 75, 100, 100, 225, 90);

        g.drawOval(430, 100, 20,20);
        g.drawOval(350, 100, 20, 20);

        g.drawLine(400, 120, 390, 140);
        g.drawLine(400, 120, 410, 140);
    }

    public static void main(String[] args) {

        new Exercicio1i();

    }

}
