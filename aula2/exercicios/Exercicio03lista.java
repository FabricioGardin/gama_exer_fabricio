package exercicios;

import java.util.Scanner;

public class Exercicio03lista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pecaA, qtA, valorA, pecaB, qtB, valorB, valorF;

        pecaA = entrada.nextDouble();
        qtA = entrada.nextDouble();
        valorA = entrada.nextDouble();
        pecaB = entrada.nextDouble();
        qtB = entrada.nextDouble();
        valorB = entrada.nextDouble();

        valorF = (qtA * valorA) + (qtB * valorB);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorF);

        entrada.close();
    }

}