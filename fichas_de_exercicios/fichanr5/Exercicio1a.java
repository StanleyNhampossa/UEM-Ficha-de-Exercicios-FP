package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1a extends JFrame {

    public Exercicio1a(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Exercício 1.a)");
        setVisible(true);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g){

        g.drawLine(100, 100, 300, 100);

    }

    public static void main(String[] args) {

        new Exercicio1a();

    }

}
