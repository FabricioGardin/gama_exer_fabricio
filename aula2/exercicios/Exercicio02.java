package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite o valor da primeira nota: ");
        nota1 = in.nextDouble();

        System.out.println("Digite o valor da segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 * 0.4) + (nota2 * 0.6);

        if (media >= 6.0) {

            System.out.println("O aluno está aprovado! " + media);

        } else {
            System.out.println("O aluno está reprovado! " + media);
        }
        in.close();
    }

}