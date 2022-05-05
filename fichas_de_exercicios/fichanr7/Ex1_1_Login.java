package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1_1_Login extends JFrame implements ActionListener {

    private final JLabel lblUsuario = new JLabel("Usuário:");
    private final JLabel lblSenha = new JLabel("Senha:");
    private final JTextField tfdUsuario = new JTextField();
    private final JPasswordField tfdSenha = new JPasswordField();
    private final JButton btnEntrar = new JButton("Entrar");
    private final JButton btnCancelar = new JButton("Cancelar");
    private final JPanel panel = new JPanel(null);


    public Ex1_1_Login(){
        setSize(500, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Login");
    }

    public void Tela(){

        lblUsuario.setBounds(20, 40, 100, 25);
        lblSenha.setBounds(20, 85, 100, 25);

        tfdUsuario.setBounds(150, 40, 250, 25);
        tfdSenha.setBounds(150, 85, 250, 25);

        btnEntrar.setBounds(150, 125, 110, 25);
        btnCancelar.setBounds(290, 125, 110, 25);

        panel.add(lblUsuario);
        panel.add(lblSenha);
        panel.add(tfdUsuario);
        panel.add(tfdSenha);
        panel.add(btnEntrar);
        panel.add(btnCancelar);


        add(panel);

        btnEntrar.addActionListener(this);
        btnCancelar.addActionListener(this);


    }

    public static void main(String[] args) {
        new Ex1_1_Login().Tela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEntrar) {
            JOptionPane.showMessageDialog(null, tfdUsuario.getText().equals(tfdSenha.getText()) ? "Sucesso" : "Falha");
        }

            if (e.getSource() == btnCancelar){
            dispose();
        }
    }
}
