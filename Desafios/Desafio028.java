/*
 27. Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

package Desafios;

import java.util.Scanner;

public class Desafio028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scan.nextInt();

        int menor = num1;
        int meio  = num1;
        int maior = num1;

        if(num2 < menor){
            meio = menor;
            menor = num2;
        } else if(num2 > maior){
            meio = maior;
            maior = num2;
        } else{
            meio = num2;
        }
        
        if(num3 < menor){
            meio = menor;
            menor = num3;
        } else if(num3 > maior){
            meio = maior;
            maior = num3;
        } else{
            meio = num3;
        }

        System.out.printf("Ordem decrescente: %d - %d - %d", maior, meio, menor); 

        scan.close();
    }
    
}
