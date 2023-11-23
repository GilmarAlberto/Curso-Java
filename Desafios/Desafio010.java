/*
 * 9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).

 */

package Desafios;

import java.util.Scanner;

public class Desafio010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit");
        double far = scan.nextDouble();

        double celsius = 5 * ((far-32)/9);

        System.out.println(String.format("%.2f Fahrenheit equivale a %.2f Celsius.", far, celsius));

        scan.close();
    }
    
}
