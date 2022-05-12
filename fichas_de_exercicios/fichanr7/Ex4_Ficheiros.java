package fichas_de_exercicios.fichanr7;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Ex4_Ficheiros {

    public ArrayList<Ex4_Modelo> resgatarFuncionarios(){
        ArrayList<Ex4_Modelo> funcionarios = null;

        try {
            FileInputStream ficheiro = new FileInputStream("src\\fichas_de_exercicios\\fichanr7\\ficheiro.dat");
            ObjectInputStream in = new ObjectInputStream(ficheiro);

            funcionarios = new ArrayList<>();


            funcionarios = (ArrayList<Ex4_Modelo>) in.readObject();
//            while (in.){
//            while (true){
//                try {
//            Ex4_Modelo funcionario = (Ex4_Modelo) in.readObject();
            //Ex4_Modelo f2 = (Ex4_Modelo) in.readObject();
//            funcionarios.add(funcionario);
            //funcionarios.add(f2);
//                }catch (EOFException e){
//                    break;
//                }
//            }


        }catch (Exception e){
            e.printStackTrace();
        }

        return funcionarios;
    }



    public void salvarFuncionario(Ex4_Modelo funcionario){

        try {
            FileOutputStream ficheiro = new FileOutputStream("src\\fichas_de_exercicios\\fichanr7\\ficheiro.dat");
            ObjectOutputStream os = new ObjectOutputStream(ficheiro);

            ArrayList <Ex4_Modelo> funcionarios = new ArrayList<>();

            funcionarios = resgatarFuncionarios();
            funcionarios.add(funcionario);

//            for(int i = 0; i < funcionarios.toArray().length; i++){
//                os.writeObject(funcionarios.get(i));
//            }
            os.writeObject(funcionarios);
            JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso");

            ficheiro.flush();
            ficheiro.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
