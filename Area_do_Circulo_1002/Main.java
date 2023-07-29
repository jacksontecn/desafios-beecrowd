package Area_do_Circulo_1002;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double n = 3.14159;
        double area = n*Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        sc.close();
    }
}
