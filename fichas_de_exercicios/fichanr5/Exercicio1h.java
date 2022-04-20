package fichas_de_exercicios.fichanr5;

import javax.swing.*;
import java.awt.*;

public class Exercicio1h extends JFrame {

    Color blueRGB = new Color(0x81A6FD);

    public Exercicio1h(){

        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Exercicio 1.h)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        g.setColor(blueRGB);
        g.drawRect(200, 180, 400, 270);
        g.fillRect(200, 180, 400, 270);

        g.setColor(Color.red);

        int [] x = {200, 600, 650, 150};
        int [] y = {100, 100, 180, 180};

        g.drawPolygon(x, y, 4);
        g.fillPolygon(x, y, 4);


        g.setColor(Color.blue);
        g.drawRect(265,250, 65, 200);
        g.fillRect(265, 250, 65, 200);

        g.drawRect(395, 225, 130, 65);
        g.fillRect(395, 225, 130, 65);

    }

    public static void main(String[] args) {

        new Exercicio1h();

    }


}
