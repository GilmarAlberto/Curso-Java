/*
 * 5. Faça um Programa que converta metros para centímetros.
 */

package Desafios;

import java.util.Scanner;

public class Desafio006 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em metros: ");
        float metros = scan.nextFloat();

        float centimetros = metros * 100;

        System.out.println(String.format("%.2f metros equivale a %.2f centímetros", metros, centimetros));

        scan.close();
        
    }
}
