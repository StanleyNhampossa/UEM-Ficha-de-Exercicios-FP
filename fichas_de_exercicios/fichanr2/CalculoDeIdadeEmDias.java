package fichas_de_exercicios.fichanr2;
/*
  Faça um programa que dado a data de nascimento no formato data, mês e ano,
  Diga quantos dias de vida a pessoa tem

 */
import java.util.Scanner;
import java.time.MonthDay;
import java.time.Year;

public class CalculoDeIdadeEmDias {

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



    public static int calculateDaysLeftInTheYear(int year, int month){

        boolean isTheYearBissexto = CalculoDeIdadeEmDias.isTheYearBissexto(year);
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

    public static boolean areTheDataOk(byte dayOfBirth, byte monthOfBirth, int yearOfBirth, byte actualDay, byte actualMonth, int actualYear){

        if (actualYear > yearOfBirth)
            return true;

        if (actualYear == yearOfBirth) {

            if(actualMonth > monthOfBirth)
                return true;

            if (actualMonth == monthOfBirth){

                if(dayOfBirth <= actualDay)
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

    public static int quantityOfBissextoYears(int yearOfBirth, int actualYear){

        int quantityOfBissextoYears = 0;

        for(int i = yearOfBirth + 1; i < actualYear; i++){

            boolean isTheYearBissexto = CalculoDeIdadeEmDias.isTheYearBissexto(i);

            if (isTheYearBissexto == true){

                quantityOfBissextoYears++;

            }

        }

        return quantityOfBissextoYears;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduza o dia de nascimento");
        byte dayOfBirth = read.nextByte();

        System.out.println("Introduza o mês em que nasceu");
        byte monthOfBirth = read.nextByte();

        System.out.println("Introduza o ano em que nasceu");
        int yearOfBirth = read.nextInt();

        byte actualDay = (byte) MonthDay.now().getDayOfMonth();
        byte actualMonth = (byte) MonthDay.now().getMonthValue();
        int actualYear = Year.now().getValue();

        boolean areTheDataOk = CalculoDeIdadeEmDias.areTheDataOk(dayOfBirth, monthOfBirth, yearOfBirth, actualDay, actualMonth, actualYear);

        if(areTheDataOk == true){

            int yearLeftInDays = 0;
            /*
              Esta variável vais calcular a quantidade de anos entre o ano de nascença
              E a data actual, sem contar com o ano de nascença
              Exemplo : yearOfBirth = 2015 e actualYear = 2022
              yearLeftInDays = 2022 - 2016 = 6
              Ela nos ajudará a saber quanto tempo existe em dias nos anos entre o de nascença e o actual
              NB: Calculará os dias usando o exemplo dos anos 2016, 2017, 2018, 2019, 2020 e 2021
             */

            if (actualYear - yearOfBirth > 0){
                yearLeftInDays = (actualYear) - (yearOfBirth + 1);
            }

            yearLeftInDays *= 365;

            int quantityOfBissextoYears = CalculoDeIdadeEmDias.quantityOfBissextoYears(yearOfBirth, actualYear);

            yearLeftInDays += quantityOfBissextoYears;
            /*
              De princípio, considerou-se que a quantidade dos dias no ano seria
              De 365 dias, sem contar com os anos bissextos, mas a função acima
              Calculava quantos anos bissextos existe entre os anos de nascença e
              Actual, daí incrementa no yearLeftInDays a quantidade de anos bissextos
             */

            boolean isTheYearOfBirthBissexto = CalculoDeIdadeEmDias.isTheYearBissexto(yearOfBirth);
            if (isTheYearOfBirthBissexto == true)
                yearLeftInDays += 366 - (CalculoDeIdadeEmDias.calculateDaysLeftInTheYear(yearOfBirth, monthOfBirth) + dayOfBirth);
            else
                yearLeftInDays += 365 - (CalculoDeIdadeEmDias.calculateDaysLeftInTheYear(yearOfBirth, monthOfBirth) + dayOfBirth);

            if(yearOfBirth == actualYear){
                yearLeftInDays = 0;
            }

            yearLeftInDays += CalculoDeIdadeEmDias.calculateDaysLeftInTheYear(actualYear, actualMonth) + actualDay;

            System.out.println("A sua idade é dias é equivalente a " + yearLeftInDays);
        }
        else System.out.println("Introduza dados correctos");

    }

}
