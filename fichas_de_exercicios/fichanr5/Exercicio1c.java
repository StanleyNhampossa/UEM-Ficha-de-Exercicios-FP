package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1c extends JFrame {

    public Exercicio1c(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Exercício 1.c)");
        setVisible(true);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g){

        g.drawRect(100, 75, 200, 150);

    }

    public static void main(String[] args) {

        new Exercicio1c();

    }


}
