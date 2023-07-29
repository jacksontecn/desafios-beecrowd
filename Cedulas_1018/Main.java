package Cedulas_1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteiro = sc.nextInt();

        if(0 < inteiro && inteiro < 1000000){

            int cem = (int) inteiro / 100;
            int restoDeCem = inteiro % 100;
            int cinquenta = (int) restoDeCem / 50;
            int restoDeCinquenta = restoDeCem % 50;
            int vinte = (int) restoDeCinquenta / 20;
            int restoDeVinte = restoDeCinquenta % 20;
            int dez = (int) restoDeVinte / 10;
            int restoDeDez = restoDeVinte % 10;
            int cinco = (int) restoDeDez / 5;
            int restoDeCinco = restoDeDez % 5;
            int dois = (int) restoDeCinco / 2;
            int restoDeDois = restoDeCinco % 2;
            int um = restoDeDois / 1;

            System.out.println(inteiro);
            System.out.println(cem + " nota(s) de R$ 100,00");
            System.out.println(cinquenta + " nota(s) de R$ 50,00");
            System.out.println(vinte + " nota(s) de R$ 20,00");
            System.out.println(dez + " nota(s) de R$ 10,00");
            System.out.println(cinco + " nota(s) de R$ 5,00");
            System.out.println(dois + " nota(s) de R$ 2,00");
            System.out.println(um + " nota(s) de R$ 1,00");
        }

        sc.close();
    }
}
