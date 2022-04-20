package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1b extends JFrame {

    public Exercicio1b(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Exercício 1.b)");
        setVisible(true);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g){

        g.drawOval(100, 50, 200, 200);

    }

    public static void main(String[] args) {

        new Exercicio1b();

    }


}
