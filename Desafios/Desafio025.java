/*
24. Faça um Programa que leia três números e mostre o maior deles.
*/

package Desafios;

import java.util.Scanner;

public class Desafio025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scan.nextInt();

        int maior = num1;

        if(num2 > maior){
            maior = num2;
        }

        if(num3 > maior){
            maior = num3;
        }

        System.out.println("O maior número é " + maior);

        scan.close(); 
        
    }
    
}
