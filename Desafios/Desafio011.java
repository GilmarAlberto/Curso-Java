/*
10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit
far = celsius * (9/5) + 32

 */

package Desafios;

import java.util.Scanner;

public class Desafio011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double far = celsius * (9.0/5.0) + 32;

        System.out.println(String.format("%.2f Celsius equivale a %.2f Fahrenheit.", celsius, far));

        scan.close();
    }
    
}
