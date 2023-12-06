/*
 20. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

package Desafios;

import java.util.Scanner;

public class Desafio021 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("O número é "+ (num>=0 ? "Positivo" : "Negativo"));

        scan.close();
    }
    
}
