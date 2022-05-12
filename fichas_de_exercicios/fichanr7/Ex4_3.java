package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex4_3 extends JFrame implements ActionListener {

    private final JLabel lblFuncionario = new JLabel("Funcionário");
    private final JLabel lblNome = new JLabel("Nome");
    private final JLabel lblDepartamento = new JLabel("Departamento");
    private final JLabel lblCategoria = new JLabel("Categoria");
    private final JLabel lblSalario = new JLabel("Salário");

    private final JTextField tfdNome = new JTextField();
    private final JTextField tfdSalario = new JTextField();

    private final JComboBox<String> cbbDepartamento = new JComboBox<>();
    private final JComboBox<String> cbbCategoria = new JComboBox<>();

    private final JButton btnSalvar = new JButton("SALVAR");
    private final JButton btnListarFuncionarios = new JButton("Todos Funcionários");

    private final JPanel panel = new JPanel(null);

    public Ex4_3(){
        setTitle("Registo Funcionário");
        setVisible(true);
        setSize(500, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void tela(){


        lblFuncionario.setBounds(160, 40, 200, 40);
        lblFuncionario.setFont(new Font("Times New Roman", Font.PLAIN, 30));

        lblNome.setBounds(20, 100, 100,25);
        tfdNome.setBounds(135, 100, 200, 25);

        lblDepartamento.setBounds(20, 140, 100, 25);
        cbbDepartamento.setBounds(135, 140, 200, 25);

        lblCategoria.setBounds(20, 190, 100, 25);
        cbbCategoria.setBounds(135, 190, 200, 25);

        lblSalario.setBounds(20, 230, 200, 25);
        tfdSalario.setBounds(135, 230, 200, 25);

        btnSalvar.setBounds(20, 280, 100, 25);
        btnListarFuncionarios.setBounds(185, 280, 150, 25);


        panel.add(lblFuncionario);
        panel.add(lblNome);
        panel.add(tfdNome);
        panel.add(lblDepartamento);
        panel.add(cbbDepartamento);
        panel.add(lblCategoria);
        panel.add(cbbCategoria);
        panel.add(lblSalario);
        panel.add(tfdSalario);
        panel.add(btnSalvar);
        panel.add(btnListarFuncionarios);

        add(panel);

        cbbDepartamento.addItem("RH");
        cbbDepartamento.addItem("FINCANÇAS");
        cbbDepartamento.addItem("ADMINISTRAÇÃO");
        cbbDepartamento.addItem("MARKETING");

        cbbCategoria.addItem("Limpeza");
        cbbCategoria.addItem("Guarda");
        cbbCategoria.addItem("Motorista");
        cbbCategoria.addItem("Contabilista");

        btnSalvar.addActionListener(this);
        btnListarFuncionarios.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSalvar){
            if(tfdNome.getText() != null && tfdNome.getText().length() > 0
            && tfdSalario.getText() != null) {
                try {
                    Ex4_Ficheiros ficheiros = new Ex4_Ficheiros();
                    Ex4_Modelo funcionario = new Ex4_Modelo(tfdNome.getText(), cbbDepartamento.getSelectedItem().toString(),
                            cbbCategoria.getSelectedItem().toString(), Double.parseDouble(tfdSalario.getText()), true);



                    ficheiros.salvarFuncionario(funcionario);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite um valor válido para salário");
                }
            }
        }

        if(e.getSource() == btnListarFuncionarios){
            Ex4_1 listar = new Ex4_1();
            listar.tela();
            dispose();
            listar.setVisible(true);

        }
    }

    /*private void salvarFuncionario(Ex4_Modelo funcionario){

            try {
                FileOutputStream ficheiro = new FileOutputStream("src\\fichas_de_exercicios\\fichanr7\\ficheiro.dat");
                ObjectOutputStream os = new ObjectOutputStream(ficheiro);

                os.writeObject(funcionario);

                ficheiro.flush();
                ficheiro.close();
                JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso");

            }catch (Exception e){
                e.printStackTrace();
            }



    }

     */

    public static void main(String[] args) {
        new Ex4_3().tela();
    }
}
