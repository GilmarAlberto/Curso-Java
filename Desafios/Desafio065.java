/*
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
o fatorial várias vezes e limitando o fatorial a números inteiros positivos
e menores que 16.
*/

package Desafios;

import java.util.Scanner;

public class Desafio065 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        do{
            int num, fat = 1;

            System.out.println("Digite um número inteiro entre 0 e 16. -1 para sair:");
            num = scan.nextInt();

            if(num == -1){
                System.out.println("Programa encerrado. Obrigado por usar.");
                break;
            }
            if(num < 0 || num > 16){
                System.out.println("Número inválido. Por favor, tente novamente.");
                continue;
            }else if(num <= 1){
                fat = 1;
            }else{
                for(int i = num; i > 1; i--){
                    fat *= i;
                }
            }

            System.out.printf("O fatorial de %d é %d\n", num, fat);
            
        }while(true);

        scan.close();
    }
}
