package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600.00) {
            System.out.println(" Será  isento do INSS ");

        } else {
            if (salario <= 1200.00) {
                System.out.println(" O desconto será do INSS será de 20%, R$ " + salario * 0.2);
            } else {
                if (salario <= 2000.00) {
                    System.out.println(" O desconto será do INSS será de 25%, R$ " + salario * 0.25);
                } else {
                    System.out.println(" O desconto será do INSS será de 30%, R$ " + salario * 0.3);
                }
            }
            entrada.close();
        }
    }
}