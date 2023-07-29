package Calculo_Simples_1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1, a2;
        int b1, b2;

        double c1, c2, resultado;

        a1 = sc.nextInt();
        a2 = sc.nextInt();
        c1 = sc.nextDouble();

        b1 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextDouble();

        resultado = ((a2*c1)+(b2*c2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);

        sc.close();
    }
}
