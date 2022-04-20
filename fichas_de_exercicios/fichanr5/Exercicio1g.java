package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1g extends JFrame {

    public Exercicio1g(){

        setSize(400, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.g)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        g.drawRect(100, 100, 200, 400);

        g.setColor(Color.red);
        g.drawOval(150, 125, 100, 100);
        g.fillOval(150, 125, 100, 100);

        g.setColor(Color.yellow);
        g.drawOval(150, 250, 100, 100);
        g.fillOval(150, 250, 100, 100);

        g.setColor(Color.green);
        g.drawOval(150, 375, 100, 100);
        g.fillOval(150, 375, 100, 100);

    }

    public static void main(String[] args) {

        new Exercicio1g();

    }

}
