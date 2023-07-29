package Salario_Bonus_1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String primeiro_nome_do_vendedor = sc.next();

        double salario_fixo_do_vendedor = sc.nextDouble();
        double total_de_vendas_efetuadas = sc.nextDouble();

        double comissao = (15 * total_de_vendas_efetuadas)/100;
        double receber = comissao + salario_fixo_do_vendedor;

        System.out.printf("TOTAL = R$ %.2f\n", receber);


        sc.close();
    }
}
