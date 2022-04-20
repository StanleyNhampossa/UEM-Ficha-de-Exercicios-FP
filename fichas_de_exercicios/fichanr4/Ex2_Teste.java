package fichas_de_exercicios.fichanr4;

import java.util.Scanner;

public class Ex2_Teste {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Ex1_Funcionario ex5Funcionario1 = new Ex1_Funcionario("Julio", "De informatica", "Director",
                "Activo", 2000);

        Ex1_Funcionario ex5Funcionario2 = new Ex1_Funcionario("Adérito", "De Matemática",
                "Chefe do Departamento", "Activo", 4000);

        ex5Funcionario1.aumentaSalario();
        System.out.println("Salário de " + ex5Funcionario1.getNome() + " aumentado para " + ex5Funcionario1.getSalario());

        System.out.println("Para quanto quer mudar o salário de " + ex5Funcionario1.getNome());
        double newSalary = read.nextDouble();

        ex5Funcionario1.setSalario(newSalary);

        System.out.println("Salário de " + ex5Funcionario1.getNome() + " modificado para " + ex5Funcionario1.getSalario());

        ex5Funcionario2.demitirFuncionario();

        ex5Funcionario1.printData();

        ex5Funcionario2.printData();

        ex5Funcionario2.readmitirFuncionario();

    }

}


