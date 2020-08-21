package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o valor do primeiro número: ");
        num1 = in.nextDouble();

        System.out.println("Digite o valor do segundo número: ");
        num2 = in.nextDouble();

       
        if (num1 > num2) {

            System.out.println( "Ordem decrescente \n" +  num1 + " , " + num2);
          
        } else {
            System.out.println( "Ordem decrescente \n" +  num2 + " , " + num1);
            
        }
        in.close();
    }

    
}