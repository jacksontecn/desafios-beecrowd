package Idade_em_dias_1020;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int dias = entrada.nextInt();

        if (dias >= 365){
            int ano = dias/365;
            int mes = (dias%365)/31;
            int dia = (dias%365)%30;

            System.out.println(ano + " ano(s)");
            System.out.println(mes + " mes(es)");
            System.out.println(dia + " dia(s)");


        } else if (dias < 30) {

            System.out.println("0 ano(s)");
            System.out.println("0 mes(es)");
            System.out.println(dias + " dia(s)");

        }else {

            int mes = (dias%365)/30;
            int dia = dias%30;

            if(mes >= 12){
                System.out.println((mes/12) + " ano(s)");
                System.out.println("0 mes(es)");
                System.out.println("0 dia(s)");
            }else{
                System.out.println("0 ano(s)");
                System.out.println(mes + " mes(es)");
                System.out.println(dia + " dia(s)");
            }

        }

    }
}
