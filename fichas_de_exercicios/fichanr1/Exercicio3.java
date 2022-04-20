package fichas_de_exercicios.fichanr1;
/*
3. Faça um algoritmo que dada temperatura em Celcius(C), converta e imprima a mesma em
Kelvin(K) e Fahrenheit(F).
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza a temperatura em Celsius");
        double temperaturaEmCelsius = ler.nextDouble();

        double temperaturaEmKelvin = 273.15 + temperaturaEmCelsius;
        double temperaturaEmFarenheit = (9 * temperaturaEmCelsius + 160)/5;

        System.out.println("A temperatura em farinheit é " + temperaturaEmFarenheit);
        System.out.println("A temperatura em Kelvin é " + temperaturaEmKelvin);

    }

}
