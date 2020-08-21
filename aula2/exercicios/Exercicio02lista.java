package exercicios;

import java.util.Scanner;

public class Exercicio02lista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorA, valorB, valorC, media;

        valorA = entrada.nextDouble();
        valorB = entrada.nextDouble();
        valorC = entrada.nextDouble();

        media = (valorA * 0.2 ) + (valorB * 0.3 ) + (valorC * 0.5 );

        System.out.printf("MEDIA = %.1f\n" , media);

        entrada.close();
    }
    
}