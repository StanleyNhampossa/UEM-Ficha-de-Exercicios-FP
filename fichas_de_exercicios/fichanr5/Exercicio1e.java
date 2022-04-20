package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1e extends JFrame {

    public Exercicio1e(){

        setSize(800, 300);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.e)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        int [] xTriangle = {150, 100, 200};
        int [] yTriangle = {50 ,200, 200};

        g.drawPolygon(xTriangle, yTriangle, 3);

        int [] xStar = {400, 450, 500, 475, 500, 450, 400, 350, 300, 325, 300, 350};
        int [] yStar = {50, 100, 100, 150, 200, 200, 250, 200, 200, 150, 100, 100};

        g.drawPolygon(xStar, yStar, 12);

        g.setColor(Color.blue);
        g.fillPolygon(xStar, yStar, 12);

    }

    public static void main(String[] args) {

        new Exercicio1e();

    }

}
