package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1_3_Calculadora extends JFrame implements ActionListener {

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");

    JButton btnMais = new JButton("+");
    JButton btnMenos = new JButton("-");
    JButton btnVezes = new JButton("x");
    JButton btnDividir = new JButton("/");
    JButton btnIgual = new JButton("=");

    JButton btnVirgula = new JButton(",");
    JButton btnMaisOuMenos = new JButton("+/-");

    JButton btnApagar = new JButton("Apagar");

    JLabel lblOperacaoEscrita = new JLabel();
    JLabel lblOperacaosendoEscrita = new JLabel();

    Color colorBlue = new Color(120, 158, 239);
    Color colorGray = new Color(187, 183, 183);

    double resultado;

    JPanel panel = new JPanel(null);
    JPanel panel1 = new JPanel(null);
    JPanel panel2 = new JPanel(null);
    JPanel panel3 = new JPanel(null);

    public Ex1_3_Calculadora(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setSize(340, 540);
    }

    public void tela(){

        btnMaisOuMenos.setBounds(3, 277, 78, 50);
        btn0.setBounds(83, 277, 78, 50);
        btnVirgula.setBounds(163, 277, 78, 50);
        btnIgual.setBounds(243, 277, 78, 50);

        btn1.setBounds(3, 225, 78, 50);
        btn2.setBounds(83, 225, 78, 50);
        btn3.setBounds(163, 225, 78, 50);
        btnMais.setBounds(243, 225, 78, 50);

        btn4.setBounds(3, 173, 78, 50);
        btn5.setBounds(83, 173, 78, 50);
        btn6.setBounds(163, 173, 78, 50);
        btnMenos.setBounds(243, 173, 78, 50);

        btn7.setBounds(3, 121, 78, 50);
        btn8.setBounds(83, 121, 78, 50);
        btn9.setBounds(163, 121, 78, 50);
        btnVezes.setBounds(243, 121, 78, 50);

        btnDividir.setBounds(243, 69, 78, 50);

        btnApagar.setBounds(243, 17, 78, 50);

        btn0.setBackground(Color.WHITE);
        btn1.setBackground(Color.WHITE);
        btn2.setBackground(Color.WHITE);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);
        btn5.setBackground(Color.WHITE);
        btn6.setBackground(Color.WHITE);
        btn7.setBackground(Color.WHITE);
        btn8.setBackground(Color.WHITE);
        btn9.setBackground(Color.WHITE);

        btnMaisOuMenos.setBackground(Color.WHITE);
        btnVirgula.setBackground(Color.WHITE);

        btnIgual.setBackground(colorBlue);
        btnMais.setBackground(colorGray);
        btnMenos.setBackground(colorGray);
        btnVezes.setBackground(colorGray);
        btnDividir.setBackground(colorGray);
        btnApagar.setBackground(colorGray);


        panel1.add(btn0);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);
        panel1.add(btn9);

        panel1.add(btnMaisOuMenos);
        panel1.add(btnVirgula);
        panel1.add(btnIgual);

        panel1.add(btnMais);
        panel1.add(btnMenos);
        panel1.add(btnVezes);
        panel1.add(btnDividir);
        panel1.add(btnApagar);






        panel1.setBounds(0, 170, 340, 370);

        panel2.setBackground(Color.BLACK);
        panel2.setBounds(0, 116, 340, 52);


        lblOperacaoEscrita.setBounds(0, 0, 340, 30);
        lblOperacaosendoEscrita.setBounds(0, 35, 340, 30);

        panel3.add(lblOperacaosendoEscrita);
        panel3.add(lblOperacaoEscrita);

        panel3.setBounds(0, 40, 340, 76);


        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);



        add(panel);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        btnApagar.addActionListener(this);
        btnMenos.addActionListener(this);
        btnMais.addActionListener(this);
        btnDividir.addActionListener(this);
        btnVezes.addActionListener(this);
        btnVirgula.addActionListener(this);
        btnMaisOuMenos.addActionListener(this);
        btnIgual.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn0){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "0");
        }

        if(e.getSource() == btn1){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "1");
        }

        if(e.getSource() == btn2){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "2");
        }

        if(e.getSource() == btn3){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "3");
        }

        if(e.getSource() == btn4){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "4");
        }

        if(e.getSource() == btn5){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "5");
        }

        if(e.getSource() == btn6){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "6");
        }

        if(e.getSource() == btn7){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "7");
        }

        if(e.getSource() == btn8){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "8");
        }

        if(e.getSource() == btn9){
            lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + "9");
        }

        if(e.getSource() == btnApagar) {
            try {
                lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText().substring(0,
                        lblOperacaosendoEscrita.getText().length() - 1));
            }catch (Exception ex){}
        }

        if(e.getSource() == btnMais){
            try {
                if (lblOperacaoEscrita.getText().isEmpty()) {
                    resultado = Double.parseDouble(lblOperacaosendoEscrita.getText());
                } else {
                    resultado += Double.parseDouble(lblOperacaosendoEscrita.getText());
                }
                lblOperacaoEscrita.setText(resultado + " + ");
                lblOperacaosendoEscrita.setText("");
            }catch (Exception ex) {}
        }

        if(e.getSource() == btnVirgula){
            if(lblOperacaosendoEscrita.getText().isEmpty()){
                lblOperacaosendoEscrita.setText("0.");
            }else {
                lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText() + ".");
            }
        }

        if(e.getSource() == btnMenos){
            try {
                if (lblOperacaoEscrita.getText().isEmpty()) {
                    resultado = Double.parseDouble(lblOperacaosendoEscrita.getText());
                } else {
                    resultado -= Double.parseDouble(lblOperacaosendoEscrita.getText());
                }
                lblOperacaoEscrita.setText(resultado + " - ");
                lblOperacaosendoEscrita.setText("");
            }catch (Exception ex) {}
        }

        if(e.getSource() == btnVezes){
            try {
                if (lblOperacaoEscrita.getText().isEmpty()) {
                    resultado = Double.parseDouble(lblOperacaosendoEscrita.getText());
                } else {
                    resultado *= Double.parseDouble(lblOperacaosendoEscrita.getText());
                }
                lblOperacaoEscrita.setText(resultado + " x ");
                lblOperacaosendoEscrita.setText("");
            }catch (Exception ex) {}
        }

        if(e.getSource() == btnDividir){
            try {
                if (lblOperacaoEscrita.getText().isEmpty()) {
                    resultado = Double.parseDouble(lblOperacaosendoEscrita.getText());
                } else {
                    resultado /= Double.parseDouble(lblOperacaosendoEscrita.getText());
                }
                lblOperacaoEscrita.setText(resultado + " / ");
                lblOperacaosendoEscrita.setText("");
            }catch (Exception ex) {}
        }

        if(e.getSource() == btnMaisOuMenos){
            try {
                if (lblOperacaosendoEscrita.getText().charAt(0) == '-') {
                    lblOperacaosendoEscrita.setText(lblOperacaosendoEscrita.getText().substring(1));
                } else {
                    lblOperacaosendoEscrita.setText("-" + lblOperacaosendoEscrita.getText());
                }
            }catch (Exception ex){}
        }

        if(e.getSource() == btnIgual){
            try {
                lblOperacaosendoEscrita.setText(String.valueOf(resultado));
                lblOperacaoEscrita.setText("");
            }catch (Exception ex){}
        }

    }



    public static void main(String[] args) {
        new Ex1_3_Calculadora().tela();
    }


}
