/*
 Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.
*/

package Desafios;

import java.util.Scanner;

public class Desafio063{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de N números: ");
        int n = scan.nextInt();
        int menor = 0, maior = 0, soma = 0, num;

        for(int i = 1; i <= n; i++){
            System.out.printf("Digite o número %d\n", i);
            num = scan.nextInt();

            if(i == 1){
                menor = num;
                maior = num;
            }else if(num < menor){
                menor = num;
            }else if(num > maior){
                maior = num;
            }

            soma += num;

        }

        System.out.printf("O número menor é %d\n", menor);
        System.out.printf("O número maior é %d\n", maior);
        System.out.printf("A soma é %d\n", soma);

        scan.close();
    }
}
