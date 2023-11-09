/*
 * 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

package Desafios;

import java.util.Scanner;

public class Desafio007 {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Digite o raio de um círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println(String.format("A área do círculo é %.2f", area));

        scan.close();
    }
    
}
