package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1d extends JFrame {

    public Exercicio1d(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Exercício 1.d)");
        setVisible(true);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g){

        g.drawLine(100, 50, 300, 220);
        g.drawLine(100, 100, 300, 270);

        g.drawLine(300, 50, 100, 220);
        g.drawLine(300, 100, 100, 270);



    }

    public static void main(String[] args) {

        new Exercicio1d();

    }

}
