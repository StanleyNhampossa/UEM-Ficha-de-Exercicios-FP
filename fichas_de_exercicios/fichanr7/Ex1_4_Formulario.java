package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1_4_Formulario extends JFrame implements ActionListener {

    private final JLabel lblTItulo = new JLabel("Título:");
    private final JTextField txfTitulo = new JTextField();

    private final JLabel lblAutores = new JLabel("Autores:");
    private final JTextField txfAutores = new JTextField();

    private final JLabel lblGenero = new JLabel("Género:");
    private final JComboBox<String> cbbGenero = new JComboBox<>();

    private final JLabel lblAno = new JLabel("Ano");
    private final JComboBox<Integer> cbbAno = new JComboBox<>();

    private final JCheckBox cbDisponivel = new JCheckBox("Disponível");

    private final JButton btnRegistar = new JButton("Registar");
    private final JButton btnLimpar = new JButton("Limpar");

    private final JPanel panel = new JPanel(null);

    public Ex1_4_Formulario(){
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Registo de Livros");
        setSize(650, 300);
    }

    public void tela(){


        lblTItulo.setBounds(20, 40, 100, 25);
        txfTitulo.setBounds(145, 40, 300, 25);

        lblAutores.setBounds(20, 85, 100, 25);
        txfAutores.setBounds(145, 85, 300, 25);

        lblGenero.setBounds(20, 130, 100, 25);
        cbbGenero.setBounds(145, 130, 200, 25);

        lblAno.setBounds(20, 175, 100, 25);
        cbbAno.setBounds(145, 175, 200, 25);

        btnRegistar.setBounds(160, 220, 100, 25);
        btnLimpar.setBounds(390, 220, 100, 25);

        cbDisponivel.setBounds(390, 175, 100, 25);



        panel.add(txfTitulo);
        panel.add(lblTItulo);
        panel.add(lblAno);
        panel.add(lblAutores);
        panel.add(lblGenero);
        panel.add(txfAutores);
        panel.add(btnRegistar);
        panel.add(btnLimpar);
        panel.add(cbDisponivel);
        panel.add(cbbAno);
        panel.add(cbbGenero);

        add(panel);

        cbbGenero.addItem("Comédia");
        cbbGenero.addItem("Romance");
        cbbGenero.addItem("Científico");
        cbbGenero.addItem("Adiversos");

        for(int i = 2010; i < 2023; i++){
            cbbAno.addItem(i);
        }

        btnRegistar.addActionListener(this);
        btnLimpar.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnRegistar){
            if(txfTitulo.getText().length() > 0 && txfAutores.getText().length() > 0) {
                JOptionPane.showMessageDialog(null, "Livro Registado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            }
        }

        if(e.getSource() == btnLimpar){
            txfAutores.setText("");
            txfTitulo.setText("");
            cbbGenero.setSelectedIndex(0);
            cbbAno.setSelectedIndex(0);
            cbDisponivel.setSelected(false);

        }

    }

    public static void main(String[] args) {
        new Ex1_4_Formulario().tela();
    }



}
