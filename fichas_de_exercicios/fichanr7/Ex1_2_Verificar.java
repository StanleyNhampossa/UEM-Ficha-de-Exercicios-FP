package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1_2_Verificar extends JFrame implements ActionListener {

    private final JLabel lblLado1 = new JLabel("Lado 1 :");
    private final JTextField txfLado1 = new JTextField();

    private final JLabel lblLado2 = new JLabel("Lado 2 :");
    private final JTextField txfLado2 = new JTextField();

    private final JLabel lblLado3 = new JLabel("Lado 3 :");
    private final JTextField txfLado3 = new JTextField();

    private final JLabel lblResultado = new JLabel("Resultado :");
    private final JLabel lblResposta = new JLabel();

    private final JButton btnVerificar = new JButton("Verificar");

    private final JPanel panel = new JPanel(null);

    public Ex1_2_Verificar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Verificar Triângulo");
        setSize(600, 300);

    }

    public void tela(){


        lblLado1.setBounds(50, 20, 100, 25);
        txfLado1.setBounds(160, 20, 200, 25);

        lblLado2.setBounds(50, 65, 100, 25);
        txfLado2.setBounds(160, 65, 200, 25);

        lblLado3.setBounds(50, 110, 100, 25);
        txfLado3.setBounds(160, 110, 200, 25);

        lblResultado.setBounds(380, 65, 65, 25);
        lblResposta.setBounds(465, 65, 100, 25);

        btnVerificar.setBounds(160, 155, 200, 25);



        panel.add(lblLado1);
        panel.add(txfLado1);

        panel.add(lblLado2);
        panel.add(txfLado2);

        panel.add(lblLado3);
        panel.add(txfLado3);

        panel.add(lblResultado);
        panel.add(lblResposta);

        panel.add(btnVerificar);

        add(panel);

        btnVerificar.addActionListener(this);

    }

    public static void main(String[] args) {
        new Ex1_2_Verificar().tela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnVerificar){
            try {
                double lado1 = Double.parseDouble(txfLado1.getText());
                double lado2 = Double.parseDouble(txfLado2.getText());
                double lado3 = Double.parseDouble(txfLado3.getText());
                lblResposta.setText(verificarTriangulo(lado1, lado2, lado3));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Preencha os dados correctamente");
            }

        }
    }

    public String verificarTriangulo(double lado1, double lado2, double lado3){

        if(lado1 == lado2 && lado2 == lado3)
            return  "Equiláterio";

        if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return "Isósceles";

        return "Escaleno";

    }
}
