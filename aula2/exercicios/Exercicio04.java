package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        double salario, prestacao, valorReferencia;

        System.out.println("Digite o valor do salário bruto: ");
        salario = in.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        prestacao = in.nextDouble();

        valorReferencia = salario * 0.30;

        if (prestacao <= valorReferencia) {

            System.out.println("Empréstimo foi concedido!");
          
        } else {
            
            System.out.println("Empréstimo  não foi concedido!");
            
        }

        in.close();
    }
    
}