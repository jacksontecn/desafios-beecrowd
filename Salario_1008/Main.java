package Salario_1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, hour;

        number = sc.nextInt();
        hour = sc.nextInt();

        double salary = sc.nextDouble();

        double calc = (hour* salary);

        System.out.println("NUMBER = "+ number);
        System.out.printf("SALARY = U$ %.2f\n", calc);
    }
}
