package uri;

import java.util.Scanner;

/**
 * exercicio1037
 */
public class Exercicio1037 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valor;

        System.out.println("Digite um valor: ");
        valor = entrada.nextDouble();

        if ((valor >= 0.00) && (valor <= 25.00)) {
            System.out.println("Intervalo [0,25]");

        } else {
            if ((valor >= 25.01) && (valor <= 50.00)) {
                System.out.println("Intervalo (25,50]");
            } else {
                if ((valor >= 75.00) && (valor <= 100.00)) {
                    System.out.println("Intervalo (75,100]");
                } else {
                    System.out.println("Fora de intervalo");
                }
            }
            entrada.close();

        }
    }
}