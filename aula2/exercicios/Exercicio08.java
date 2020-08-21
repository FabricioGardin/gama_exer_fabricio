package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o valor do lado A: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor do lado B: ");
        b = entrada.nextInt();
        System.out.println("Digite o valor do lado C: ");
        c = entrada.nextInt();

        if (a > b + c || b > a + c || c > b + a) {
            System.out.println(" Não forma um triângulo ");

        } else {
            if (a == b && a == c ) {
                System.out.println(" Forma um triângulo equilátero ");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println(" Forma um triângulo isósceles ");
                } else {
                    System.out.println("  Forma um triângulo escaleno ");
                }
            }
            entrada.close();
        }
    }

}