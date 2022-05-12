package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Ex4_1 extends JFrame implements ActionListener {

    public Ex4_1(){
        setTitle("Listar");
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JComboBox<String> cbbDepartamento = new JComboBox<>();
    JButton btnPesquisar = new JButton("PESQUISAR");
    JButton btnRegistarFuncionario = new JButton("Registar Funcionário");

    //Instanciando a tabela que vai listar os funcionários
    JTable tbListarFuncionarios = new JTable();
    private final String [] colunas = {"Nome", "Departamento", "Categoria", "Salário", "Status"};

    //Instanciando o modelo que a tabela deve adoptar
    private final DefaultTableModel model = new DefaultTableModel(){
        //Desabilita a parte de editar dados directamente da tabela
        @Override
        public boolean isCellEditable(final int row, final int column){
            return false;
        }
    };
    JPanel panel = new JPanel(null);

    public void tela(){

        cbbDepartamento.setBounds(25, 40, 100, 25);
        btnPesquisar.setBounds(140, 40, 120, 25);
        btnRegistarFuncionario.setBounds(275, 40, 175, 25);

        JScrollPane jScrollPane;

        /* Adoptando o modelo criado do tipo string que ele deve seguir
         * Nome, Departamento, Categoria, Salário, Status
         */
        model.setColumnIdentifiers(colunas);


        //Dizendo qual é o modelo que a tabela deve seguir, neste caso,
        //O modelo criado por nós
        tbListarFuncionarios.setModel(model);

        //Dizendo a altura que cada linha deve ter uma em relação a outra
        tbListarFuncionarios.setRowHeight(20);

        jScrollPane = new JScrollPane(tbListarFuncionarios);
        jScrollPane.setBounds(25, 80, 450, 150);


        panel.add(cbbDepartamento);
        panel.add(btnPesquisar);
        panel.add(btnRegistarFuncionario);
        panel.add(jScrollPane);

        add(panel);

        cbbDepartamento.addItem("Todos");
        cbbDepartamento.addItem("RH");
        cbbDepartamento.addItem("Limpeza");
        cbbDepartamento.addItem("Finanças");
        cbbDepartamento.addItem("Marketing");


        Ex4_Ficheiros ficheiros = new Ex4_Ficheiros();
        ArrayList<Ex4_Modelo> funcionarios = ficheiros.resgatarFuncionarios();


        /* Este método tenta preencher com dados que está dentro do ArrayList, usando o forEach
         * E ele deverá seguir o modelo criado por nós, se um dado estiver na posição incorrecta
         * A tabela também estará preenchida de forma incorrecta
         */
        try {
            funcionarios.forEach((Ex4_Modelo funcionario) ->{
                //o método addRow permite adicionar uma linha no modelo
                model.addRow(new Object [] {
                        funcionario.getNome(),
                        funcionario.getDepartamento(),
                        funcionario.getCategoria(),
                        funcionario.getSalario(),
                        funcionario.isStatus()
                });

            });
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar funcionário");
        }
        
    }

    /*private ArrayList<Ex4_Modelo> resgatarFuncionarios(){
        ArrayList<Ex4_Modelo> funcionarios = null;

        try {
            FileInputStream ficheiro = new FileInputStream("src\\fichas_de_exercicios\\fichanr7\\ficheiro.dat");
            ObjectInputStream in = new ObjectInputStream(ficheiro);

            funcionarios = new ArrayList<>();



//            while (in.){
//            while (true){
//                try {
                    Ex4_Modelo funcionario = (Ex4_Modelo) in.readObject();
                    //Ex4_Modelo f2 = (Ex4_Modelo) in.readObject();
                    funcionarios.add(funcionario);
                    //funcionarios.add(f2);
//                }catch (EOFException e){
//                    break;
//                }
//            }

            System.out.println(funcionarios.toArray().length);
        }catch (Exception e){
            e.printStackTrace();
        }

        return funcionarios;
    }

     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnRegistarFuncionario){
            new Ex4_3().tela();
        }

        if (e.getSource() == btnPesquisar){

        }
    }

    public static void main(String[] args) {
        new Ex4_1().tela();
    }
}
