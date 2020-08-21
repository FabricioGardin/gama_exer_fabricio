package exercicios;

import java.util.Scanner;

/**
 * exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numero;

        System.out.println("Digite um número inteiro: ");
        numero = in.nextFloat();

        if (numero > 20) {

            System.out.println("A metade do número é: " + numero / 2);

        }
        in.close();
    }
}