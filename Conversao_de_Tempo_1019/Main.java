package Conversao_de_Tempo_1019;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        if (N >= 3600){

            int horas = N / 3600;
            int minutos = (N%3600)/60;
            int segundos = N%60;

            System.out.println(horas + ":" + minutos + ":" + segundos);

        }else if (N < 60){

            System.out.println("0:0:" + N);

        }else {

            int minutos = (N%3600)/60;
            int segundos = N%60;

            System.out.println("0:" + minutos + ":" + segundos);

        }

    }
}
