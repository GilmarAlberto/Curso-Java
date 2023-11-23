/*
 * 11. Faça um Programa que peça 2 números inteiros e um número real. Calcule * e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 */

package Desafios;

import java.util.Scanner;

public class Desafio012 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        double num3 = scan.nextDouble();

        //a. o produto do dobro do primeiro com metade do segundo .
        double a = (num1 * 2.0) * (num2/2.0);

        //b. a soma do triplo do primeiro com o terceiro.
        double b = (num1 * 3.0) + num3;

        //c. o terceiro elevado ao cubo.
        double c = Math.pow(num3,3);

        System.out.println(String.format("a. o produto do dobro do primeiro com metade do segundo: %.2f ", a));
        
        System.out.println(String.format("b. a soma do triplo do primeiro com o terceiro: %.2f", b));

        System.out.println(String.format("c. o terceiro elevado ao cubo: %.2f", c));

        scan.close();
        
    }
}
