package exercicios;

import java.util.Scanner;

/**
 * exercicio01lista
 */
public class Exercicio01lista {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorA, valorB, soma;

        valorA = entrada.nextInt();

        valorB = entrada.nextInt();

        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);

        entrada.close();

    }

}
