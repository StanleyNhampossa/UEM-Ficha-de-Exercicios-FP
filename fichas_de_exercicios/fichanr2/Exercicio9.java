package fichas_de_exercicios.fichanr2;

/*
9. Crie sistema de gestão de um parque de estacionamento de automóveis. O sistema deve
coletar o mês, dia, hora e minuto de entrada. Após a coleta desses dados garanta que o
sistema apresente na tela quanto tempo o carro ficou em minutos e sabendo que o preço
de estadia é de 100,00mt por minuto, informe também quanto é que o cliente irá pagar.
 */

import java.util.Scanner;


public class Exercicio9 {


    public static final byte JANUARY = 31;
    public static final byte MARCH = 31;
    public static final byte APRIL = 30;
    public static final byte MAY = 31;
    public static final byte JUNE = 30;
    public static final byte JULY = 31;
    public static final byte AUGUST = 31;
    public static final byte SETEMBER = 30;
    public static final byte OCTOBER = 31;
    public static final byte NOVEMBER = 30;
    public static final byte DECEMBER = 31;


    public static int tempoPassadoNumaHora(int minutoDeEntrada, int minutoDeSaida){

        return (60 - minutoDeEntrada) + minutoDeSaida;

    }






    public static int CalculateDaysLeftInTheYear(int year, int month){

        boolean isTheYearBissexto = Exercicio9.isTheYearBissexto(year);
        byte february;
        if (isTheYearBissexto == true)
            february = 29;
        else
            february = 28;

        int [] months = {JANUARY, february, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SETEMBER, OCTOBER, NOVEMBER, DECEMBER};
        int daysLeftInTheYear = 0;
        for (int i = 0; i < month - 1; i++){
            daysLeftInTheYear += months[i];
        }
        return daysLeftInTheYear;

    }

    public static boolean AreTheDataOk(byte entraceDay, byte entraceMonth, int entraceYear, byte entraceHour, byte entraceMinute, byte exitDay, byte exitMonth, int exitYear, byte exitHour, byte exitMinute){

        if (exitYear > entraceYear)
            return true;

        if (exitYear == entraceYear) {

            if(exitMonth > entraceMonth)
                return true;

            if (exitMonth == entraceMonth){

                if(entraceDay == exitDay){

                    if(entraceHour == exitHour){

                        if(entraceMinute <= exitMinute)
                            return true;

                    }

                    if(entraceHour < exitHour)
                        return true;

                }

                if (entraceDay < exitDay)
                    return true;

            }

        }

        return false;

    }

    public static boolean isTheYearBissexto(int year){

        if (year % 4 == 0){

            if (year % 100 == 0){

                if (year % 400 == 0)
                    return true;

            }
            else
                return true;

        }

        return false;
    }


    public static int QuantityOfBissextoYears(int yearOfBirth, int actualYear){

        int quantityOfBissextoYears = 0;

        for(int i = yearOfBirth + 1; i < actualYear; i++){

            boolean isTheYearBissexto = Exercicio9.isTheYearBissexto(i);

            if (isTheYearBissexto == true){

                quantityOfBissextoYears++;

            }

        }

        return quantityOfBissextoYears;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o dia da entrada");
        byte diaDeEntrada = read.nextByte();

        System.out.println("Introduza o mês da entrada");
        byte mesDeEntrada = read.nextByte();

        System.out.println("Introduza o ano da entrada");
        int anoDeEntrada = read.nextInt();

        System.out.println("Introduza a hora da entrada");
        byte horaDeEntrada = read.nextByte();

        System.out.println("Introduza o minuto da entrada");
        byte minutoDeEntrada = read.nextByte();


        System.out.println("Introduza o dia da saída");
        byte diaDeSaida = read.nextByte();

        System.out.println("Introduza o mês da saída");
        byte mesDeSaida = read.nextByte();

        System.out.println("Introduza o ano da saída");
        int anoDeSaida = read.nextInt();

        System.out.println("Introduza a hora da saída");
        byte horaDeSaida = read.nextByte();

        System.out.println("Introduza o minuto da saída");
        byte minutoDeSaida = read.nextByte();




        boolean areTheDataOk = Exercicio9.AreTheDataOk(diaDeEntrada, mesDeEntrada, anoDeEntrada, horaDeEntrada, minutoDeEntrada, diaDeSaida, mesDeSaida, anoDeSaida, horaDeSaida, minutoDeSaida);

        int tempoEmMinuto = 0;

        if(areTheDataOk == true){

            if(anoDeEntrada < anoDeSaida ){

            }

            if(anoDeEntrada == anoDeSaida){

                if(mesDeEntrada < mesDeSaida){


                    int february;
                    if(isTheYearBissexto(anoDeEntrada) == true){
                        february = 29;
                    }
                    else {
                        february = 28;
                    }
                    int [] months = {JANUARY, february, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SETEMBER, OCTOBER, NOVEMBER, DECEMBER};


                    for(int i = mesDeEntrada + 1; i < mesDeSaida; i++){
                        tempoEmMinuto+= (months[i] * 24 * 60);
                    }

                    for(int i = diaDeEntrada + 1; i <= months[mesDeEntrada]; i++){
                        tempoEmMinuto += (24 * 60);
                    }

                    for(int i = 1; i < diaDeSaida; i++){
                        tempoEmMinuto += (24 * 60);
                    }

//                    tempoEmMinuto += 24 - (horaDeEntrada + 1);
//                    tempoEmMinuto += horaDeSaida;
//
//                    tempoEmMinuto += minutoDeSaida;
//
//                    tempoEmMinuto += 60 - minutoDeEntrada;



                }

                if(mesDeEntrada == mesDeSaida){

                    if(diaDeEntrada < diaDeSaida){

                        for(int i = diaDeEntrada + 1; i < diaDeSaida; i++){
                            tempoEmMinuto += (24 * 60);
                        }
                        tempoEmMinuto += ((24 - (horaDeEntrada + 1)) + horaDeSaida) * 60;
                        tempoEmMinuto += (60 - minutoDeEntrada) + minutoDeSaida;


                    }

                    if(diaDeEntrada == diaDeSaida){

                        if(horaDeEntrada < horaDeSaida){

                            for(int i = horaDeEntrada + 1; i < horaDeSaida; i++){
                                tempoEmMinuto+= 60;
                            }
                            tempoEmMinuto+= (60 - minutoDeEntrada) + minutoDeSaida;


                        }

                        if(horaDeEntrada == horaDeSaida){

                            tempoEmMinuto = minutoDeSaida - minutoDeEntrada;

                        }


                    }



                }

            }
            System.out.println("Ficou " + tempoEmMinuto);

        }
        else {
            System.out.println("Introduza dados correctos");
        } //20220531
          //20210315






    }



}


