package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex4_2 extends JFrame implements ActionListener {

    private final JLabel lblTitulo = new JLabel("Autenticação");
    private final JLabel lblUsuario = new JLabel("Usuário");
    private final JLabel lblSenha = new JLabel("Senha");
    private final JTextField tfdUsuario = new JTextField();
    private final JPasswordField tfdSenha = new JPasswordField();
    private final JButton btnEntrar = new JButton("Entrar");
    private final JButton btnCancelar = new JButton("Cancelar");
    private final JPanel panel = new JPanel(null);


    public Ex4_2(){
        setSize(375, 375);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Login");
    }

    public void tela(){

        lblTitulo.setBounds(105, 20, 200, 50);
        lblTitulo.setForeground(Color.blue);
        lblTitulo.setFont(new Font("Times new Roman", Font.PLAIN, 30));

        lblUsuario.setBounds(55, 75, 100, 30);
        tfdUsuario.setBounds(55, 125, 250, 30);

        lblSenha.setBounds(55, 175, 100, 30);
        tfdSenha.setBounds(55, 225, 250, 30);

        btnEntrar.setBounds(55, 275, 100, 30);
        btnCancelar.setBounds(205, 275, 100, 30);

        panel.add(lblTitulo);
        panel.add(lblUsuario);
        panel.add(tfdUsuario);
        panel.add(lblSenha);
        panel.add(tfdSenha);
        panel.add(btnEntrar);
        panel.add(btnCancelar);

        add(panel);

        btnEntrar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }

    public static void main(String[] args) {
        new Ex4_2().tela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnEntrar){
            if(tfdUsuario.getText().equals("sistema") && tfdSenha.getText().equals("12345678")){
                new Ex4_1().tela();
            }else{
                JOptionPane.showMessageDialog(null, "Credenciais incorrectos");
            }
        }

        if(e.getSource() == btnCancelar){
            dispose();
        }
    }
}
