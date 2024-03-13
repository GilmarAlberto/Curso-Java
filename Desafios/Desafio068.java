/*
Faça um programa que mostre todos os primos entre 1 e N sendo N
um número inteiro fornecido pelo usuário. O programa deverá mostrar
também o número de divisões que ele executou para encontrar os
números primos. Serão avaliados o funcionamento, o estilo e o número
de testes (divisões) executados
*/

package Desafios;

import java.util.Scanner;

public class Desafio068{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        if(num < 2){
            System.out.println("Não há primos para este intervalo.");
            scan.close();
            return;
        }

        int divisoes = 0;

        for(int i = 2; i <= num; i++){

            boolean primo = true;

            for(int j = 2; j <= Math.sqrt(i); j++){
                divisoes++;
                if(i % j == 0){
                    primo = false;
                    break;
                }
            }

            if(primo){
                System.out.printf("%d ", i);
            }
        }

        System.out.println("\nNúmero total de divisões: " + divisoes);
        
        scan.close();
    }
}
