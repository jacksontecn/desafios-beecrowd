package Gasto_de_Combustivel_1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora = sc.nextInt();

        int kmh = sc.nextInt();

        int km = kmh*hora;

        double litros = km/12.0;

        System.out.printf("%.3f\n", litros);

        sc.close();
    }
}
