package Distancia_entre_dois_pontos_1015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, x2, y1, y2;

        x1 = sc.nextDouble(); y1 = sc.nextDouble();
        x2 = sc.nextDouble(); y2 = sc.nextDouble();

        double p1 = Math.pow(x2 - x1, 2);
        double p2 = Math.pow(y2 - y1, 2);

        double distancia = Math.sqrt(p1+p2);

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
